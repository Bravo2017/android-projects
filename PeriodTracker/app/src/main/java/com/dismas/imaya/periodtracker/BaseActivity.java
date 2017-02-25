package com.dismas.imaya.periodtracker;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.StatFs;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.File;
import java.util.Locale;

/**
 * Created by imaya on 1/30/17.
 */
@SuppressLint({"NewApi"})
public abstract class BaseActivity
        extends AppCompatActivity
{
    public Locale a;
    protected AdView b;
    protected FanAdView c;
    protected LinearLayout d;
    protected boolean e = false;
    protected boolean f = false;
    public boolean g = false;
    public boolean h = false;
    protected ActionBar i = null;
    protected String j = "ca-app-pub-1980576454975917/7325991381";
    protected String k = "779049512140652_794733717238898";
    protected boolean l = false;
    public boolean m = true;
    public d n;
    protected long o = 0L;
    public String p = "";
    public StringBuffer q = new StringBuffer();
    public ProgressDialog r;
    private int s;
    private boolean t = false;
    private Handler u = new Handler()
    {
        public void handleMessage(Message paramAnonymousMessage)
        {
            switch (paramAnonymousMessage.what)
            {
                default:
                    return;
                case 128:
                    new k().a(BaseActivity.this, "0", n.a().g);
                    return;
                case 127:
                    paramAnonymousMessage = (String)paramAnonymousMessage.obj;
                    h.a(this, BaseActivity.this, paramAnonymousMessage);
                    return;
                case 124:
                    paramAnonymousMessage = paramAnonymousMessage.getData();
                    BaseActivity.this.a(paramAnonymousMessage.getString("exception"), paramAnonymousMessage.getString("path"), paramAnonymousMessage.getBoolean("doSendLog"));
                    return;
                case 125:
                    try
                    {
                        if ((BaseActivity.this.r != null) && (BaseActivity.this.r.isShowing())) {
                            BaseActivity.this.r.dismiss();
                        }
                        Bundle localBundle = paramAnonymousMessage.getData();
                        if (localBundle.getBoolean("doSendLog"))
                        {
                            String str = localBundle.getString("path") + "";
                            if (!str.equals(""))
                            {
                                paramAnonymousMessage = str;
                                if (!str.equals("null")) {}
                            }
                            else
                            {
                                paramAnonymousMessage = "no auto file";
                            }
                            h.a(BaseActivity.this, paramAnonymousMessage + "\n" + localBundle.getString("exception"));
                            return;
                        }
                    }
                    catch (Exception localException)
                    {
                        for (;;)
                        {
                            r.a().a(BaseActivity.this, "BaseActivity", 25, localException, "");
                            localException.printStackTrace();
                        }
                        g.a().f = true;
                        BaseActivity.a(BaseActivity.this);
                        return;
                    }
            }
            BaseActivity.this.r = new ProgressDialog(BaseActivity.this);
            BaseActivity.this.r.setMessage(BaseActivity.this.getString(2131165520));
            BaseActivity.this.r.show();
            BaseActivity.this.r.setCancelable(false);
            new Thread(new Runnable()
            {
                public void run()
                {
                    for (;;)
                    {
                        try
                        {
                            localObject1 = BaseActivity.this.getDatabasePath("PC.db");
                            if (localObject1 != null) {
                                continue;
                            }
                            com.popularapp.periodcalendar.c.b.d().b(BaseActivity.this, "databasefile==null");
                        }
                        catch (Exception localException)
                        {
                            Object localObject1;
                            Message localMessage;
                            Bundle localBundle;
                            boolean bool;
                            long l1;
                            long l2;
                            float f;
                            r.a().a(BaseActivity.this, "BaseActivity", 26, localException, "");
                            localException.printStackTrace();
                            continue;
                            com.popularapp.periodcalendar.c.b.d().b(BaseActivity.this, "databasefile not exists");
                            continue;
                            r.a().a(BaseActivity.this, "数据库异常", "自动恢复", "结果:失败/没有备份文件", null);
                            localMessage.what = 125;
                            localObject2 = p.a(BaseActivity.this);
                            str = "" + (String)localObject2;
                            localFile = new File((String)localObject2);
                            localObject2 = str;
                            if (localFile == null) {
                                break label714;
                            }
                            if (!localFile.exists()) {
                                break label746;
                            }
                            localObject2 = str + "# exists:true # canwrite:" + localFile.canWrite() + " # canRead:" + localFile.canRead();
                        }
                        localObject1 = new ab().a(BaseActivity.this);
                        localMessage = Message.obtain();
                        localBundle = new Bundle();
                        if (localObject1 == null) {
                            continue;
                        }
                        localBundle.putString("path", (String)localObject1);
                        localMessage.what = 124;
                        localObject1 = this.a;
                        localBundle.putString("exception", (String)localObject1);
                        localBundle.putBoolean("doSendLog", this.b);
                        localMessage.setData(localBundle);
                        BaseActivity.b(BaseActivity.this).sendMessage(localMessage);
                        return;
                        if (!((File)localObject1).exists()) {
                            continue;
                        }
                        com.popularapp.periodcalendar.c.b.d().b(BaseActivity.this, "databasefile exists " + ((File)localObject1).getAbsolutePath() + " can read:" + ((File)localObject1).canRead() + " can wirte:" + ((File)localObject1).canWrite());
                        if (((File)localObject1).canRead())
                        {
                            bool = p.a((File)localObject1, p.f(BaseActivity.this) + "/crash_db.log");
                            com.popularapp.periodcalendar.c.b.d().b(BaseActivity.this, "copy db right:" + bool);
                            bool = p.a(BaseActivity.this.getDatabasePath("PC_PILL.db").getAbsolutePath(), p.f(BaseActivity.this) + "/crash_db_1.log");
                            com.popularapp.periodcalendar.c.b.d().b(BaseActivity.this, "copy db_1 right:" + bool);
                            if (((File)localObject1).isFile()) {
                                com.popularapp.periodcalendar.c.b.d().b(BaseActivity.this, "file size:" + ((File)localObject1).length());
                            }
                            localObject1 = new File(((File)localObject1).getParent());
                            if ((localObject1 != null) && (((File)localObject1).exists()))
                            {
                                localObject1 = new StatFs(((File)localObject1).getAbsolutePath());
                                l1 = ((StatFs)localObject1).getBlockSize();
                                l2 = ((StatFs)localObject1).getBlockCount();
                                f = (float)(((StatFs)localObject1).getFreeBlocks() * l1 / 1024L) / 1024.0F;
                                com.popularapp.periodcalendar.c.b.d().b(BaseActivity.this, "db folder free:" + f + " total:" + (float)(l1 * l2 / 1024L) / 1024.0F);
                            }
                        }
                    }
                    for (;;)
                    {
                        String str;
                        File localFile;
                        label714:
                        Object localObject2 = (String)localObject2 + "\n" + this.a;
                        break;
                        label746:
                        localObject2 = str + "# exists:false";
                    }
                }
            }).start();
        }
    };

    private void a(final boolean paramBoolean)
    {
        if ((!com.popularapp.periodcalendar.utils.c.c(this)) && (com.popularapp.periodcalendar.utils.c.g(this)))
        {
            m.a(this).b(this, 1003);
            Log.e("ads", "initFan");
        }
        do
        {
            try
            {
                this.c = new FanAdView(new a(this), this.k, com.popularapp.periodcalendar.utils.c.h(getApplicationContext()));
                if (this.c != null)
                {
                    this.d.removeAllViews();
                    ViewGroup.LayoutParams localLayoutParams = this.d.getLayoutParams();
                    localLayoutParams.width = getResources().getDisplayMetrics().widthPixels;
                    localLayoutParams.height = ((int)(com.popularapp.periodcalendar.utils.c.h(getApplicationContext()).b() * getResources().getDisplayMetrics().density + 0.5F));
                    this.d.setLayoutParams(localLayoutParams);
                    this.d.addView(this.c);
                    this.c.setAdListener(new com.facebook.ads.c()
                    {
                        public void onAdClicked(com.facebook.ads.a paramAnonymousa)
                        {
                            Log.e("fan ad", "onAdClicked");
                            r.a().a(BaseActivity.this, "广告统计", "点击 fan banner", BaseActivity.this.p, null);
                        }

                        public void onAdLoaded(com.facebook.ads.a paramAnonymousa)
                        {
                            if (BaseActivity.this.c != null) {
                                BaseActivity.this.c.c();
                            }
                            Log.e("fan ad", "onAdLoaded");
                            r.a().b(BaseActivity.this, "广告统计", "load fan banner success", BaseActivity.this.p, null);
                        }

                        public void onError(com.facebook.ads.a paramAnonymousa, com.facebook.ads.b paramAnonymousb)
                        {
                            Log.e("fan ad", paramAnonymousb.b() + "");
                            BaseActivity.this.d();
                            if (paramBoolean) {
                                BaseActivity.a(BaseActivity.this, false);
                            }
                            r.a().b(BaseActivity.this, "广告统计", "load fan banner failed:" + paramAnonymousb.b(), BaseActivity.this.p, null);
                        }
                    });
                    this.c.a();
                }
                m.a(this).b(this, 1004);
                return;
            }
            catch (Exception localException)
            {
                for (;;)
                {
                    localException.printStackTrace();
                    if (paramBoolean) {
                        b(false);
                    }
                    r.a().a(this, "BaseActivity", 7, localException, "");
                }
            }
            catch (Error localError)
            {
                for (;;)
                {
                    localError.printStackTrace();
                    if (paramBoolean) {
                        b(false);
                    }
                    r.a().a(this, "BaseActivity", 8, localError, "");
                }
            }
            if (paramBoolean)
            {
                b(false);
                return;
            }
        } while ((this.d == null) || ((this instanceof MainActivity)));
        this.d.setVisibility(8);
    }

    private void b(final boolean paramBoolean)
    {
        if (com.popularapp.periodcalendar.utils.c.b(this))
        {
            if (paramBoolean) {
                a(false);
            }
            while ((this.d == null) || ((this instanceof MainActivity))) {
                return;
            }
            this.d.setVisibility(8);
            return;
        }
        Log.e("ads", "initAdmob");
        m.a(this).a(this, 1001);
        try
        {
            this.b = new AdView(this);
            this.b.setAdUnitId(this.j);
            this.b.setAdSize(com.google.android.gms.ads.AdSize.SMART_BANNER);
            if (this.b == null) {
                break label310;
            }
            this.d.removeAllViews();
            localObject = this.d.getLayoutParams();
            ((ViewGroup.LayoutParams)localObject).width = com.google.android.gms.ads.AdSize.SMART_BANNER.getWidthInPixels(this);
            ((ViewGroup.LayoutParams)localObject).height = com.google.android.gms.ads.AdSize.SMART_BANNER.getHeightInPixels(this);
            this.d.setLayoutParams((ViewGroup.LayoutParams)localObject);
            this.d.addView(this.b);
            localObject = new AdRequest.Builder();
            if (!com.popularapp.periodcalendar.a.a.S(this)) {
                ((AdRequest.Builder)localObject).tagForChildDirectedTreatment(true);
            }
            if (!com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) {
                break label365;
            }
            localBundle = new Bundle();
            localBundle.putString("color_bg", "FFFFFF");
            localBundle.putString("color_bg_top", "FFFFFF");
            localBundle.putString("color_border", "FFFFFF");
            localBundle.putString("color_link", "1A9BF9");
            localBundle.putString("color_text", "1A9BF9");
            localBundle.putString("color_url", "1A9BF9");
            ((AdRequest.Builder)localObject).addNetworkExtras(new AdMobExtras(localBundle));
        }
        catch (Error localError)
        {
            for (;;)
            {
                Object localObject;
                Bundle localBundle;
                if (this.b != null) {
                    this.b = null;
                }
                if (paramBoolean) {
                    a(false);
                }
                localError.printStackTrace();
                r.a().a(this, "BaseActivity", 10, localError, "");
                continue;
                if (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green"))
                {
                    localBundle = new Bundle();
                    localBundle.putString("color_bg", "FFFFFF");
                    localBundle.putString("color_bg_top", "FFFFFF");
                    localBundle.putString("color_border", "FFFFFF");
                    localBundle.putString("color_link", "19D596");
                    localBundle.putString("color_text", "19D596");
                    localBundle.putString("color_url", "19D596");
                    localError.addNetworkExtras(new AdMobExtras(localBundle));
                }
            }
        }
        catch (Exception localException)
        {
            for (;;)
            {
                if (this.b != null) {
                    this.b = null;
                }
                if (paramBoolean) {
                    a(false);
                }
                localException.printStackTrace();
                r.a().a(this, "BaseActivity", 11, localException, "");
            }
        }
        this.b.loadAd(((AdRequest.Builder)localObject).build());
        this.b.setAdListener(new AdListener()
        {
            public void onAdClosed()
            {
                Log.e("Ads", "onAdClosed");
            }

            public void onAdFailedToLoad(int paramAnonymousInt)
            {
                r.a().b(BaseActivity.this, "广告统计", "load admob banner failed:" + paramAnonymousInt, BaseActivity.this.p, null);
                Log.e("Ads", "onAdFailedToLoad");
                if (paramBoolean) {
                    BaseActivity.b(BaseActivity.this, false);
                }
            }

            public void onAdLeftApplication()
            {
                r.a().a(BaseActivity.this, "广告统计", "点击 admob banner", BaseActivity.this.p, null);
            }

            public void onAdLoaded()
            {
                Log.e("Ads", "onAdLoaded");
                r.a().b(BaseActivity.this, "广告统计", "load admob banner success", BaseActivity.this.p, null);
            }

            public void onAdOpened()
            {
                Log.e("Ads", "onAdOpened");
            }
        });
        m.a(this).a(this, 1002);
        return;
        label310:
        m.a(this).a(this, 1002);
    }

    private void i()
    {
        if ((g.a().w != -1L) && ((this instanceof CalendarActivity)))
        {
            a.a locala = new a.a(this);
            View localView = LayoutInflater.from(this).inflate(2130903213, null);
            final TextView localTextView1 = (TextView)localView.findViewById(2131624756);
            final TextView localTextView2 = (TextView)localView.findViewById(2131624757);
            localTextView1.setText(getString(2131165728) + " - " + com.popularapp.periodcalendar.a.a.d.a(this, System.currentTimeMillis(), this.a));
            localTextView2.setText(getString(2131165755) + " - " + com.popularapp.periodcalendar.a.a.d.a(this, g.a().w, this.a));
            localTextView1.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
            {
                public void onGlobalLayout()
                {
                    if (localTextView1.getLineCount() > 1)
                    {
                        localTextView1.setTextSize(2, 12.0F);
                        localTextView2.setTextSize(2, 12.0F);
                    }
                    if (Build.VERSION.SDK_INT >= 16)
                    {
                        localTextView1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        return;
                    }
                    localTextView1.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            });
            localTextView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
            {
                public void onGlobalLayout()
                {
                    if (localTextView2.getLineCount() > 1)
                    {
                        localTextView1.setTextSize(2, 12.0F);
                        localTextView2.setTextSize(2, 12.0F);
                    }
                    if (Build.VERSION.SDK_INT >= 16)
                    {
                        localTextView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        return;
                    }
                    localTextView2.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            });
            locala.setTitle(2131165319);
            locala.setView(localView);
            locala.setPositiveButton(getString(2131165674), new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    try
                    {
                        paramAnonymousDialogInterface = new Intent("android.settings.DATE_SETTINGS");
                        BaseActivity.this.startActivity(paramAnonymousDialogInterface);
                        BaseActivity.this.finish();
                        r.a().a(BaseActivity.this, "手机时间校对", "对时对话框", "Go Setting", null);
                        System.exit(0);
                        Process.killProcess(Process.myPid());
                        return;
                    }
                    catch (Exception paramAnonymousDialogInterface)
                    {
                        paramAnonymousDialogInterface.printStackTrace();
                    }
                }
            });
            locala.setNegativeButton(getString(2131165485), null);
            locala.show();
            g.a().w = -1L;
            r.a().a(this, "手机时间校对", "对时对话框", "弹出", null);
        }
    }

    private void j()
    {
        if (g.a().b) {
            finish();
        }
        if (g.a().f)
        {
            if (((this instanceof MainActivity)) || ((this instanceof SettingActivity)))
            {
                startActivity(new Intent(this, AdActivity.class));
                g.a().f = false;
            }
            finish();
        }
    }

    public abstract void a();

    public void a(int paramInt)
    {
        if ((AdActivity.a != null) && (!AdActivity.a.b)) {
            AdActivity.a.a(paramInt);
        }
    }

    protected void a(d paramd)
    {
        for (;;)
        {
            TextView localTextView1;
            try
            {
                NativeAd localNativeAd = paramd.b;
                View localView = LayoutInflater.from(this).inflate(2130903164, null);
                int i1 = (int)(com.popularapp.periodcalendar.utils.c.h(getApplicationContext()).b() * getResources().getDisplayMetrics().density + 0.5F);
                localView.setLayoutParams(new LinearLayout.LayoutParams(getResources().getDisplayMetrics().widthPixels, i1));
                ImageView localImageView2 = (ImageView)localView.findViewById(2131623988);
                Object localObject = (RelativeLayout.LayoutParams)localImageView2.getLayoutParams();
                ((RelativeLayout.LayoutParams)localObject).height = i1;
                ((RelativeLayout.LayoutParams)localObject).width = i1;
                localImageView2.setLayoutParams((ViewGroup.LayoutParams)localObject);
                localObject = (RelativeLayout)localView.findViewById(2131624585);
                TextView localTextView3 = (TextView)localView.findViewById(2131623989);
                TextView localTextView2 = (TextView)localView.findViewById(2131624587);
                localTextView1 = (TextView)localView.findViewById(2131624586);
                ImageView localImageView1 = (ImageView)localView.findViewById(2131624588);
                if ((paramd.c != null) && (!paramd.c.isRecycled()))
                {
                    localImageView2.setImageBitmap(paramd.c);
                    localTextView3.setText(localNativeAd.i());
                    paramd = localNativeAd.k();
                    if ((paramd != null) && (!paramd.equals("")))
                    {
                        localTextView2.setText(paramd);
                        paramd = localNativeAd.l();
                        if ((paramd == null) || (paramd.equals(""))) {
                            break label407;
                        }
                        localTextView1.setText(paramd);
                        localImageView1.setOnClickListener(new View.OnClickListener()
                        {
                            public void onClick(View paramAnonymousView)
                            {
                                try
                                {
                                    paramAnonymousView = new Intent();
                                    paramAnonymousView.setAction("android.intent.action.VIEW");
                                    paramAnonymousView.addCategory("android.intent.category.BROWSABLE");
                                    paramAnonymousView.setData(Uri.parse("https://m.facebook.com/ads/ad_choices"));
                                    BaseActivity.this.startActivity(paramAnonymousView);
                                    return;
                                }
                                catch (Exception paramAnonymousView)
                                {
                                    paramAnonymousView.printStackTrace();
                                }
                            }
                        });
                        this.d.removeAllViews();
                        paramd = this.d.getLayoutParams();
                        paramd.width = getResources().getDisplayMetrics().widthPixels;
                        paramd.height = ((int)(com.popularapp.periodcalendar.utils.c.h(getApplicationContext()).b() * getResources().getDisplayMetrics().density + 0.5F));
                        this.d.setLayoutParams(paramd);
                        this.d.addView(localView);
                        localNativeAd.a(new com.facebook.ads.c()
                        {
                            public void onAdClicked(com.facebook.ads.a paramAnonymousa)
                            {
                                Log.e("fan native banner", "onAdClicked");
                                r.a().a(BaseActivity.this, "广告统计", "点击 native banner", BaseActivity.this.p, null);
                            }

                            public void onAdLoaded(com.facebook.ads.a paramAnonymousa)
                            {
                                r.a().b(BaseActivity.this, "广告统计", "load native banner success", BaseActivity.this.p, null);
                            }

                            public void onError(com.facebook.ads.a paramAnonymousa, com.facebook.ads.b paramAnonymousb)
                            {
                                r.a().b(BaseActivity.this, "广告统计", "load native banner failed", BaseActivity.this.p, null);
                            }
                        });
                        localNativeAd.a((View)localObject);
                    }
                }
                else
                {
                    NativeAd.a(localNativeAd.f(), localImageView2);
                    continue;
                }
                localTextView2.setVisibility(8);
            }
            catch (Exception paramd)
            {
                r.a().a(this, "BaseActivity", 5, paramd, "");
                paramd.printStackTrace();
                return;
            }
            continue;
            label407:
            localTextView1.setVisibility(8);
        }
    }

    public void a(Exception paramException)
    {
        if (!this.t)
        {
            this.t = true;
            r.a().a(this, "数据库异常", "错误异常", "" + paramException.getMessage(), null);
            r.a().a(this, "BaseActivity", 27, paramException, "");
            com.popularapp.periodcalendar.c.b.d().a(this, "DATABASE_ERROR", true);
            h.a(this, this.u, paramException);
        }
    }

    public void a(final String paramString1, final String paramString2, final boolean paramBoolean)
    {
        new Thread(new Runnable()
        {
            public void run()
            {
                com.popularapp.periodcalendar.a.a.b.d(BaseActivity.this);
                int i = new ab().a(BaseActivity.this, this, com.popularapp.periodcalendar.a.a.b, paramString2);
                if (i == 0) {
                    r.a().a(BaseActivity.this, "数据库异常", "自动恢复", "结果:成功", null);
                }
                for (;;)
                {
                    Message localMessage = Message.obtain();
                    Bundle localBundle = new Bundle();
                    localBundle.putString("exception", paramString1);
                    localBundle.putBoolean("doSendLog", paramBoolean);
                    localBundle.putString("path", i + "#" + paramString2);
                    localMessage.setData(localBundle);
                    localMessage.what = 125;
                    BaseActivity.b(BaseActivity.this).sendMessage(localMessage);
                    return;
                    r.a().a(BaseActivity.this, "数据库异常", "自动恢复", "结果:失败" + i, null);
                }
            }
        }).start();
    }

    protected void b()
    {
        for (;;)
        {
            try
            {
                if (!this.f)
                {
                    boolean bool = com.popularapp.periodcalendar.utils.c.f(this);
                    if (!bool) {}
                }
                else
                {
                    return;
                }
                if (this.h)
                {
                    this.d = ((LinearLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624027)));
                    if (this.d != null)
                    {
                        if (Build.VERSION.SDK_INT == 21) {
                            this.d.setLayerType(1, null);
                        }
                        f();
                        this.s = i.k(this);
                        if (((this.s != 1) && (this.s != 0) && (this.s != 3)) || (com.popularapp.periodcalendar.utils.c.c(this)) || (!com.popularapp.periodcalendar.utils.c.g(this))) {
                            break;
                        }
                        this.n = com.popularapp.periodcalendar.model_compat.c.a().a(this);
                        if (this.n == null) {
                            break;
                        }
                        a(this.n);
                    }
                }
                else
                {
                    this.d = ((LinearLayout)findViewById(2131624027));
                }
            }
            finally {}
        }
        for (;;)
        {
            try
            {
                switch (this.s)
                {
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        b(false);
                }
            }
            catch (Exception localException)
            {
                r.a().a(this, "BaseActivity", 3, localException, "");
                localException.printStackTrace();
                this.e = true;
                break;
                a(true);
            }
            catch (Error localError)
            {
                r.a().a(this, "BaseActivity", 4, localError, "");
                localError.printStackTrace();
                this.e = true;
            }
            break;
            b(true);
            break;
            b(false);
            break;
            a(false);
            break;
        }
    }

    protected void b(int paramInt)
    {
        try
        {
            if (Build.VERSION.SDK_INT >= 21)
            {
                getWindow().clearFlags(67108864);
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setStatusBarColor(paramInt);
            }
            return;
        }
        catch (Exception localException)
        {
            localException.printStackTrace();
        }
    }

    protected void c()
    {
        if ((this.d == null) || ((this.d != null) && (this.d.getChildCount() <= 0))) {
            b();
        }
    }

    public void d()
    {
        if (this.c != null)
        {
            this.c.c();
            this.c.setAdListener(null);
            this.c.b();
            this.c = null;
        }
    }

    public void e()
    {
        try
        {
            if (this.b != null)
            {
                this.b.setAdListener(null);
                this.b.destroy();
                this.b = null;
            }
            return;
        }
        catch (Exception localException)
        {
            r.a().a(this, "BaseActivity", 18, localException, "");
            localException.printStackTrace();
            return;
        }
        catch (Error localError)
        {
            r.a().a(this, "BaseActivity", 19, localError, "");
            localError.printStackTrace();
        }
    }

    public void f()
    {
        try
        {
            if (this.d != null) {
                this.d.removeAllViews();
            }
            d();
            e();
            g();
            return;
        }
        catch (NullPointerException localNullPointerException)
        {
            for (;;)
            {
                localNullPointerException.printStackTrace();
            }
        }
    }

    public void g()
    {
        if (this.n != null) {
            com.popularapp.periodcalendar.model_compat.c.a().b(this.n);
        }
    }

    public void h()
    {
        if ((AdActivity.a != null) && (!AdActivity.a.b) && (!AdActivity.a.isFinishing())) {
            AdActivity.a.finish();
        }
    }

    public void onConfigurationChanged(Configuration paramConfiguration)
    {
        if (paramConfiguration.orientation == 2) {
            if (paramConfiguration.hardKeyboardHidden != 1) {
                break label33;
            }
        }
        for (;;)
        {
            super.onConfigurationChanged(paramConfiguration);
            return;
            if (paramConfiguration.orientation != 1) {
                break;
            }
            break;
            label33:
            if (paramConfiguration.hardKeyboardHidden != 2) {}
        }
    }

    public void onCreate(Bundle paramBundle)
    {
        this.o = System.currentTimeMillis();
        try
        {
            super.onCreate(paramBundle);
            this.i = getSupportActionBar();
            if (this.i != null) {
                this.i.hide();
            }
            if (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green"))
            {
                b(Color.parseColor("#ff18df9c"));
                this.a = u.a(this, com.popularapp.periodcalendar.a.a.au(this));
                if (paramBundle != null) {
                    this.l = true;
                }
                this.k = com.popularapp.periodcalendar.utils.c.a();
                g.a().m = true;
                a();
            }
        }
        catch (Exception localException)
        {
            try
            {
                do
                {
                    for (;;)
                    {
                        g.a().g = getClass().getName();
                        a(34);
                        return;
                        localException = localException;
                        r.a().a(this, "BaseActivity", 0, localException, "");
                        localException.printStackTrace();
                        new t(this).a("系统资源加载");
                    }
                } while (!com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue"));
                b(Color.parseColor("#ff489bdd"));
            }
            catch (Exception paramBundle)
            {
                for (;;)
                {
                    r.a().a(this, "BaseActivity", 1, paramBundle, "");
                    paramBundle.printStackTrace();
                }
            }
            catch (Error paramBundle)
            {
                for (;;)
                {
                    r.a().a(this, "BaseActivity", 2, paramBundle, "");
                    paramBundle.printStackTrace();
                }
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu paramMenu)
    {
        try
        {
            if ((this.i == null) || (!this.i.isShowing()))
            {
                MenuItem localMenuItem = paramMenu.add(0, 0, 0, 2131165516);
                localMenuItem.setIcon(2130837845);
                MenuItemCompat.setShowAsAction(localMenuItem, 0);
            }
        }
        catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
        {
            for (;;)
            {
                r.a().a(this, "BaseActivity", 22, localIndexOutOfBoundsException, "");
                localIndexOutOfBoundsException.printStackTrace();
            }
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
            for (;;)
            {
                r.a().a(this, "BaseActivity", 23, localNotFoundException, "");
                localNotFoundException.printStackTrace();
            }
        }
        return super.onCreateOptionsMenu(paramMenu);
    }

    protected void onDestroy()
    {
        f();
        this.m = false;
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem paramMenuItem)
    {
        try
        {
            int i1 = paramMenuItem.getItemId();
            switch (i1)
            {
            }
        }
        catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
        {
            for (;;)
            {
                UserCompat localUserCompat;
                r.a().a(this, "BaseActivity", 24, localIncompatibleClassChangeError, "");
                localIncompatibleClassChangeError.printStackTrace();
            }
            startActivity(new Intent(this, SetPwdActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(paramMenuItem);
        localUserCompat = com.popularapp.periodcalendar.a.a.b.a(this, com.popularapp.periodcalendar.a.a.f(this));
        if ((localUserCompat != null) && (localUserCompat.getPassword() != null)) {
            if (!localUserCompat.getPassword().equals(""))
            {
                if (!(this instanceof MainActivity)) {}
                finish();
                g.a().b = true;
                return true;
            }
        }
        startActivity(new Intent(this, SetPwdActivity.class));
        return true;
    }

    public void onPause()
    {
        try
        {
            if (this.b != null) {
                this.b.pause();
            }
            super.onPause();
            return;
        }
        catch (Exception localException)
        {
            for (;;)
            {
                r.a().a(this, "BaseActivity", 16, localException, "");
                localException.printStackTrace();
            }
        }
        catch (Error localError)
        {
            for (;;)
            {
                r.a().a(this, "BaseActivity", 17, localError, "");
                localError.printStackTrace();
            }
        }
    }

    public void onResume()
    {
        this.g = false;
        if (!(this instanceof MainActivity))
        {
            com.popularapp.periodcalendar.a.a.d(this);
            h();
        }
        for (;;)
        {
            if (!this.e)
            {
                c();
                j();
                new z(this).a();
            }
            try
            {
                if (this.b != null) {
                    this.b.resume();
                }
                i();
                super.onResume();
                return;
                this.e = true;
                continue;
                this.e = false;
            }
            catch (Exception localException)
            {
                for (;;)
                {
                    r.a().a(this, "BaseActivity", 14, localException, "");
                    localException.printStackTrace();
                }
            }
            catch (Error localError)
            {
                for (;;)
                {
                    r.a().a(this, "BaseActivity", 15, localError, "");
                    localError.printStackTrace();
                }
            }
        }
    }

    public void onStart()
    {
        try
        {
            r.a().b(this, this.p + "");
            super.onStart();
            return;
        }
        catch (Exception localException)
        {
            for (;;)
            {
                r.a().a(this, "BaseActivity", 20, localException, "");
                localException.printStackTrace();
            }
        }
        catch (Error localError)
        {
            for (;;)
            {
                r.a().a(this, "BaseActivity", 21, localError, "");
                localError.printStackTrace();
            }
        }
    }
}
