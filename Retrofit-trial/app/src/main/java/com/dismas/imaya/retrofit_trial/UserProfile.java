package com.dismas.imaya.retrofit_trial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by imaya on 4/18/16.
 */
public class UserProfile extends Activity implements Validator.ValidationListener {
    static final String API = "https://api.github.com";        //BASE URL
    Validator validator;


    @Bind(R.id.profile_image)
    ImageView image;

    @NotEmpty
    @Bind(R.id.username_edit)
    EditText username_edit;

    @NotEmpty
    @Bind(R.id.name_edit)
    EditText name_edit;

    @NotEmpty
    @Email
    @Bind(R.id.email_edit)
    EditText email_edit;

    @NotEmpty
    @Bind(R.id.public_repos_edit)
    EditText public_repos_edit;

    @NotEmpty
    @Bind(R.id.public_gists_edit)
    EditText public_gists_edit;

    @NotEmpty
    @Bind(R.id.followers_edit)
    EditText followers_edit;

    @NotEmpty
    @Bind(R.id.following_edit)
    EditText following_edit;


    @Bind(R.id.done_button)
    Button done_button;

    @Bind(R.id.cancel_button)
    Button cancel_button;

    @Override
    public void onValidationSucceeded() {
        Toast.makeText(this, "Yay! we got it right!", Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {
        for (ValidationError error : errors) {
            View view = error.getView();
            String message = error.getCollatedErrorMessage(this);

            // Display error messages ;)
            if (view instanceof EditText) {
                ((EditText) view).setError(message);
            } else {
                Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        ButterKnife.bind(this);

        validator = new Validator(this);
        validator.setValidationListener(this);
        // Code…


        Intent i = getIntent();
        String name = i.getStringExtra("name");

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API).build();                                        //create an adapter for retrofit with base url

        GitApi git = restAdapter.create(GitApi.class);


        git.getUser(name, new Callback<User>() {
            @Override
            public void failure(RetrofitError error) {

            }

            @Override
            public void success(User user, Response response) {

                Picasso.with(getApplicationContext())
                        .load(user.getAvatar())
                        .into(image);
                username_edit.setText(user.getLogin());
                name_edit.setText(user.getName());
                email_edit.setText(user.getEmail());
                public_repos_edit.setText(user.getPublicRepos());
                public_gists_edit.setText(user.getPublicGists());
                followers_edit.setText(String.valueOf(user.getFollowers()));
                following_edit.setText(String.valueOf(user.getFollowing()));
                cancel_button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        finish();
                    }
                });

                done_button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        validator.validate();
                    }
                });

            }


        });
    }
}
