package com.dismas.imaya.periodtracker;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends BaseActivity
{
    public final int A = 4;
    public final int B = 5;
    public final int C = 10;
    public final int D = 12;
    public final int E = 13;
    public final int F = 25;
    public final int G = 22;
    public final int H = 23;
    public final int I = 24;
    private LinearLayout J;
    private TextView K;
    private TextView L;
    private TextView M;
    private TextView N;
    private LinearLayout O;
    private View P;
    private LinearLayout Q;
    private TextView R;
    private TextView S;
    private View T;
    private ImageView U;
    private TextView V;
    private TextView W;
    private RelativeLayout X;
    private TextView Y;
    private RelativeLayout Z;
    private boolean aA = false;
    private boolean aB = true;
    private boolean aC = false;
    private boolean aD = false;
    private String aE = "";
    private GoogleAccountCredential aF;
    private final int aG = 1;
    private final int aH = 2;
    private final int aI = 3;
    private final int aJ = 4;
    private final int aK = 7;
    private final int aL = 14;
    private final int aM = 15;
    private final int aN = 16;
    private final int aO = 18;
    private final int aP = 19;
    private Handler aQ = new Handler()
    {
        public void handleMessage(Message paramAnonymousMessage)
        {
            int j = 0;
            if (MainActivity.this.x) {}
            for (;;)
            {
                return;
                switch (paramAnonymousMessage.what)
                {
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                    case 17:
                    case 20:
                    case 21:
                    default:
                        return;
                    case 2:
                        for (;;)
                        {
                            boolean bool;
                            try
                            {
                                if ((MainActivity.a(MainActivity.this) != null) && (MainActivity.a(MainActivity.this).isShowing())) {
                                    MainActivity.a(MainActivity.this).dismiss();
                                }
                                MainActivity.b(MainActivity.this);
                                i = com.popularapp.periodcalendar.a.a.s(MainActivity.this, -1);
                                if (((com.popularapp.periodcalendar.a.a.a == null) || (com.popularapp.periodcalendar.a.a.a.size() <= 0)) && (i < 0))
                                {
                                    MainActivity.a(MainActivity.this, false);
                                    return;
                                }
                            }
                            catch (Exception paramAnonymousMessage)
                            {
                                r.a().a(MainActivity.this, "MainActivity", 0, paramAnonymousMessage, "");
                                paramAnonymousMessage.printStackTrace();
                                continue;
                                int i = j;
                                if (e.d(MainActivity.this))
                                {
                                    i = j;
                                    if (com.popularapp.periodcalendar.a.a.ar(MainActivity.this))
                                    {
                                        MainActivity.a(MainActivity.this, new n().a(MainActivity.this));
                                        i = 1;
                                    }
                                }
                                if ((!MainActivity.this.x) && (i == 0) && (!com.popularapp.periodcalendar.a.a.ab(MainActivity.this)))
                                {
                                    bool = MainActivity.c(MainActivity.this);
                                    if (!MainActivity.d(MainActivity.this)) {
                                        break label351;
                                    }
                                    if (bool) {
                                        com.popularapp.periodcalendar.a.a.E(MainActivity.this, 4);
                                    }
                                }
                                MainActivity.e(MainActivity.this).sendEmptyMessageDelayed(12, 100L);
                                return;
                            }
                            if (bool) {
                                new s().a(MainActivity.this, MainActivity.e(MainActivity.this));
                            } else {
                                MainActivity.f(MainActivity.this);
                            }
                        }
                    case 3:
                        try
                        {
                            if ((MainActivity.a(MainActivity.this) != null) && (MainActivity.a(MainActivity.this).isShowing())) {
                                MainActivity.a(MainActivity.this).dismiss();
                            }
                            ad.a(new WeakReference(MainActivity.this), MainActivity.this.getResources().getString(2131165814, new Object[] { "" }), "显示toast/首页/恢复成功");
                            MainActivity.g(MainActivity.this);
                            return;
                        }
                        catch (Exception paramAnonymousMessage)
                        {
                            for (;;)
                            {
                                r.a().a(MainActivity.this, "MainActivity", 1, paramAnonymousMessage, "");
                                paramAnonymousMessage.printStackTrace();
                            }
                        }
                    case 4:
                        try
                        {
                            if ((MainActivity.a(MainActivity.this) != null) && (MainActivity.a(MainActivity.this).isShowing())) {
                                MainActivity.a(MainActivity.this).dismiss();
                            }
                            ad.a(new WeakReference(MainActivity.this), MainActivity.this.getString(2131165811), "显示toast/首页/恢复失败");
                            MainActivity.h(MainActivity.this);
                            return;
                        }
                        catch (Exception paramAnonymousMessage)
                        {
                            for (;;)
                            {
                                r.a().a(MainActivity.this, "MainActivity", 2, paramAnonymousMessage, "");
                                paramAnonymousMessage.printStackTrace();
                            }
                        }
                    case 5:
                        MainActivity.a(MainActivity.this, new ProgressDialog(MainActivity.this));
                        MainActivity.a(MainActivity.this).setMessage(MainActivity.this.getString(2131165810));
                        MainActivity.a(MainActivity.this).show();
                        return;
                    case 10:
                        new aa().a(MainActivity.this);
                        return;
                    case 25:
                        MainActivity.i(MainActivity.this);
                        return;
                    case 22:
                        MainActivity.j(MainActivity.this);
                        return;
                    case 23:
                        MainActivity.k(MainActivity.this);
                        return;
                    case 24:
                        MainActivity.l(MainActivity.this);
                        return;
                    case 12:
                        MainActivity.this.l();
                        MainActivity.m(MainActivity.this);
                        return;
                    case 13:
                        MainActivity.a(MainActivity.this, (String)paramAnonymousMessage.obj);
                        return;
                    case 14:
                        try
                        {
                            if ((MainActivity.a(MainActivity.this) != null) && (MainActivity.a(MainActivity.this).isShowing())) {
                                MainActivity.a(MainActivity.this).dismiss();
                            }
                            o.a(MainActivity.this, "Rating feedback", (String)paramAnonymousMessage.obj);
                            r.a().a(MainActivity.this, "feedback", "Rating", MainActivity.this.p, null);
                            return;
                        }
                        catch (Exception localException)
                        {
                            for (;;)
                            {
                                r.a().a(MainActivity.this, "MainActivity", 3, localException, "");
                                localException.printStackTrace();
                            }
                        }
                    case 15:
                        try
                        {
                            if ((MainActivity.a(MainActivity.this) != null) && (MainActivity.a(MainActivity.this).isShowing())) {
                                MainActivity.a(MainActivity.this).dismiss();
                            }
                            MainActivity.g(MainActivity.this);
                            return;
                        }
                        catch (Exception paramAnonymousMessage)
                        {
                            for (;;)
                            {
                                r.a().a(MainActivity.this, "MainActivity", 3, paramAnonymousMessage, "");
                                paramAnonymousMessage.printStackTrace();
                            }
                        }
                    case 16:
                        try
                        {
                            if ((MainActivity.a(MainActivity.this) != null) && (MainActivity.a(MainActivity.this).isShowing())) {
                                MainActivity.a(MainActivity.this).dismiss();
                            }
                            MainActivity.a(MainActivity.this, true);
                            return;
                        }
                        catch (Exception paramAnonymousMessage)
                        {
                            for (;;)
                            {
                                r.a().a(MainActivity.this, "MainActivity", 4, paramAnonymousMessage, "");
                                paramAnonymousMessage.printStackTrace();
                            }
                        }
                    case 19:
                        try
                        {
                            label351:
                            if ((MainActivity.a(MainActivity.this) != null) && (MainActivity.a(MainActivity.this).isShowing())) {
                                MainActivity.a(MainActivity.this).dismiss();
                            }
                            MainActivity.b(MainActivity.this, true);
                            return;
                        }
                        catch (Exception paramAnonymousMessage)
                        {
                            for (;;)
                            {
                                r.a().a(MainActivity.this, "MainActivity", 5, paramAnonymousMessage, "");
                                paramAnonymousMessage.printStackTrace();
                            }
                        }
                }
                MainActivity.c(MainActivity.this, false);
                try
                {
                    if ((MainActivity.a(MainActivity.this) != null) && (MainActivity.a(MainActivity.this).isShowing()))
                    {
                        MainActivity.a(MainActivity.this).dismiss();
                        switch (paramAnonymousMessage.arg1)
                        {
                            case 1:
                                if (paramAnonymousMessage.obj != null) {
                                    MainActivity.n(MainActivity.this);
                                }
                                ad.a(new WeakReference(MainActivity.this), MainActivity.this.getString(2131165260), "显示toast/首页/授权成功_已经授权");
                                return;
                        }
                    }
                }
                catch (Exception paramAnonymousMessage)
                {
                    r.a().a(MainActivity.this, "MainActivity", 8, paramAnonymousMessage, "");
                    paramAnonymousMessage.printStackTrace();
                    return;
                }
            }
            MainActivity.b(MainActivity.this, false);
            return;
            try
            {
                MainActivity.this.startActivityForResult((Intent)paramAnonymousMessage.obj, 7);
                return;
            }
            catch (ActivityNotFoundException paramAnonymousMessage)
            {
                r.a().a(MainActivity.this, "MainActivity", 7, paramAnonymousMessage, "");
                paramAnonymousMessage.printStackTrace();
                MainActivity.b(MainActivity.this, false);
                return;
            }
            MainActivity.b(MainActivity.this, false);
            return;
        }
    };
    private TextView aa;
    private RelativeLayout ab;
    private TextView ac;
    private RelativeLayout ad;
    private TextView ae;
    private RelativeLayout af;
    private TextView ag;
    private RelativeLayout ah;
    private TextView ai;
    private RelativeLayout aj;
    private LinearLayout ak;
    private TextView al;
    private ImageView am;
    private TextView an;
    private LinearLayout ao;
    private TextView ap;
    private TextView aq;
    private ImageView ar;
    private RelativeLayout as;
    private long at;
    private com.popularapp.periodcalendar.a.b au;
    private f av;
    private AlertDialog aw;
    private ProgressDialog ax;
    private boolean ay = false;
    private boolean az = false;
    public int s;
    public final int t = 1;
    public final int u = 2;
    public final int v = 3;
    public final int w = 4;
    public boolean x;
    public final int y = 2;
    public final int z = 3;

    private void A()
    {
        if (this.s == 1) {
            r.a().b(this, this.p, "输入_经期开始", "点击宠物", null);
        }
        for (;;)
        {
            switch (this.s)
            {
                default:
                    return;
                if (this.s == 2) {
                    r.a().b(this, this.p, "输入_经期结束", "点击宠物", null);
                }
                break;
            }
        }
        if (this.s == 1)
        {
            startActivity(new Intent(this, PeriodStartActivity.class));
            return;
        }
        Intent localIntent = new Intent(this, PeriodEditActivity.class);
        localIntent.putExtra("edit_type", 1);
        startActivity(localIntent);
        return;
        a("点击宠物");
        return;
        localIntent = new Intent(this, PeriodEditActivity.class);
        localIntent.putExtra("edit_type", 0);
        startActivity(localIntent);
    }

    private void B()
    {
        Cell localCell = this.au.c(this, this.av, this.au.c(System.currentTimeMillis()));
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(System.currentTimeMillis());
        long l = this.au.a(localCalendar.get(1), localCalendar.get(2), localCalendar.get(5));
        switch (this.au.a(this, this.av, localCell, l))
        {
            default:
                this.ao.setVisibility(8);
                this.K.setGravity(17);
                this.M.setGravity(17);
                return;
            case 2:
                this.ap.setText(getText(2131165461));
                return;
            case 1:
                this.ap.setText(getText(2131165549));
                return;
        }
        this.ap.setText(getText(2131165525));
    }

    private void C()
    {
        try
        {
            switch (this.s)
            {
                case 1:
                    this.al.setText(getString(2131165543));
                    if (!com.popularapp.periodcalendar.d.a.b(this).equals("")) {
                        return;
                    }
                    this.an.setText(getString(2131165547));
                    return;
            }
        }
        catch (NullPointerException localNullPointerException)
        {
            r.a().a(this, "MainActivity", 13, localNullPointerException, "");
            localNullPointerException.printStackTrace();
            return;
        }
        this.al.setText(getString(2131165542));
        if (com.popularapp.periodcalendar.d.a.b(this).equals(""))
        {
            this.an.setText(getString(2131165547));
            return;
            if (com.popularapp.periodcalendar.d.a.b(this).equals(""))
            {
                this.al.setText(getString(2131165875));
                this.an.setText(getString(2131165684));
                return;
            }
            if ((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green")))
            {
                this.al.setText(getString(2131165875) + " " + getString(2131165684));
                return;
                this.al.setText(getString(2131165400));
                if (com.popularapp.periodcalendar.d.a.b(this).equals(""))
                {
                    this.an.setText(getString(2131165547));
                    return;
                }
            }
        }
    }

    private void D()
    {
        this.T.setVisibility(0);
        if ((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green")))
        {
            this.O.setVisibility(0);
            this.O.setOnClickListener(null);
            this.Q.setGravity(21);
            this.S.setGravity(5);
            String str = this.a.getLanguage().toLowerCase();
            if ((!str.equals("fr")) && (!str.equals("fi")) && (!str.equals("uk")) && (!str.equals("fa")) && (!str.equals("ar")) && (!str.equals("ur"))) {
                break label216;
            }
            this.V.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361842) * 0.8F);
            if (!com.popularapp.periodcalendar.a.a.c(this.a)) {
                break label234;
            }
            this.V.setTypeface(q.a().c(com.popularapp.periodcalendar.d.a.c(this)));
        }
        for (;;)
        {
            this.V.setVisibility(0);
            this.V.setText(getString(2131165694));
            this.W.setVisibility(8);
            return;
            label216:
            this.V.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361842));
            break;
            label234:
            this.V.setTypeface(Typeface.DEFAULT);
        }
    }

    private void E()
    {
        this.T.setVisibility(0);
        if ((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green")))
        {
            this.O.setVisibility(0);
            this.O.setOnClickListener(null);
            this.Q.setGravity(21);
            this.S.setGravity(5);
            String str = this.a.getLanguage().toLowerCase();
            if ((!str.equals("fr")) && (!str.equals("fi")) && (!str.equals("uk")) && (!str.equals("fa")) && (!str.equals("ar")) && (!str.equals("ur"))) {
                break label216;
            }
            this.V.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361842) * 0.8F);
            if (!com.popularapp.periodcalendar.a.a.c(this.a)) {
                break label234;
            }
            this.V.setTypeface(q.a().c(com.popularapp.periodcalendar.d.a.c(this)));
        }
        for (;;)
        {
            this.V.setVisibility(0);
            this.V.setText(getString(2131165415));
            this.W.setVisibility(8);
            return;
            label216:
            this.V.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361842));
            break;
            label234:
            this.V.setTypeface(Typeface.DEFAULT);
        }
    }

    private boolean F()
    {
        if (this.aD)
        {
            int i = com.popularapp.periodcalendar.a.a.ah(this);
            if (i <= 10)
            {
                i += 1;
                com.popularapp.periodcalendar.a.a.E(this, i);
                if ((i == 5) || (i == 10)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean G()
    {
        Object localObject1 = new java.io.File(p.a(this));
        int i;
        if ((localObject1 != null) && (((java.io.File)localObject1).exists()))
        {
            localObject1 = ((java.io.File)localObject1).listFiles();
            if (localObject1 != null)
            {
                int j = localObject1.length;
                i = 0;
                if (i < j)
                {
                    Object localObject2 = localObject1[i];
                    if ((localObject2 == null) || (!((java.io.File)localObject2).exists()) || (!(((java.io.File)localObject2).getAbsolutePath() + "").contains(".auto"))) {}
                }
            }
        }
        do
        {
            return true;
            i += 1;
            break;
            localObject1 = new java.io.File(p.e(this));
            if ((localObject1 == null) || (!((java.io.File)localObject1).exists())) {
                break label138;
            }
            localObject1 = ((java.io.File)localObject1).listFiles();
        } while ((localObject1 != null) && (localObject1.length > 0));
        label138:
        return false;
    }

    private void H()
    {
        try
        {
            e.a locala = new e.a(this);
            locala.setTitle(2131166000);
            locala.setMessage(2131165348);
            locala.setPositiveButton(2131165809, new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    MainActivity.u(MainActivity.this);
                }
            });
            locala.setNegativeButton(2131165309, null);
            locala.create();
            locala.show();
            return;
        }
        catch (Exception localException)
        {
            r.a().a(this, "MainActivity", 16, localException, "");
            localException.printStackTrace();
        }
    }

    private void I()
    {
        try
        {
            this.ax = new ProgressDialog(this);
            this.ax.setMessage(getString(2131165810));
            this.ax.setCancelable(false);
            this.ax.show();
            new Thread(new Runnable()
            {
                public void run()
                {
                    label416:
                    label421:
                    label424:
                    for (;;)
                    {
                        Object localObject4;
                        try
                        {
                            Object localObject1 = com.popularapp.periodcalendar.googledrive.a.a(MainActivity.v(MainActivity.this), MainActivity.this, MainActivity.w(MainActivity.this)).files().list();
                            ((Drive.Files.List)localObject1).setQ("'appdata' in parents");
                            Object localObject3 = (FileList)((Drive.Files.List)localObject1).execute();
                            if (localObject3 == null) {
                                break label416;
                            }
                            localObject1 = null;
                            Iterator localIterator = ((FileList)localObject3).getItems().iterator();
                            if (localIterator.hasNext())
                            {
                                com.google.api.services.drive.model.File localFile = (com.google.api.services.drive.model.File)localIterator.next();
                                localObject4 = localObject1;
                                if (localFile.getDescription() == null) {
                                    break label421;
                                }
                                localObject3 = localObject1;
                                if (localObject1 == null) {
                                    localObject3 = localFile;
                                }
                                localObject4 = localObject3;
                                if (((com.google.api.services.drive.model.File)localObject3).getModifiedDate().getValue() >= localFile.getModifiedDate().getValue()) {
                                    break label421;
                                }
                                localObject1 = localFile;
                                break label424;
                            }
                            if (localObject1 == null) {
                                break label416;
                            }
                            localObject1 = com.popularapp.periodcalendar.googledrive.a.a(com.popularapp.periodcalendar.googledrive.a.a(MainActivity.v(MainActivity.this), MainActivity.this, MainActivity.w(MainActivity.this)).getRequestFactory().buildGetRequest(new GenericUrl(((com.google.api.services.drive.model.File)localObject1).getDownloadUrl())).execute().getContent(), MainActivity.this, "GoogleDrive.pc");
                            if ((localObject1 == null) || (((String)localObject1).equals(""))) {
                                break label416;
                            }
                            i = new ab().a(MainActivity.this, this, MainActivity.x(MainActivity.this), (String)localObject1);
                        }
                        catch (Exception localException)
                        {
                            r.a().a(MainActivity.this, "MainActivity", 17, localException, "");
                            localException.printStackTrace();
                            i = -1;
                            continue;
                        }
                        catch (Error localError)
                        {
                            r.a().a(MainActivity.this, "MainActivity", 18, localError, "");
                            localError.printStackTrace();
                            i = -1;
                            continue;
                            MainActivity.e(MainActivity.this).sendEmptyMessage(15);
                            return;
                        }
                        switch (i)
                        {
                            default:
                                MainActivity.e(MainActivity.this).sendEmptyMessage(19);
                                return;
                            case 0:
                            case 1:
                                MainActivity.e(MainActivity.this).sendEmptyMessage(10);
                                return;
                            case 2:
                                MainActivity.e(MainActivity.this).sendEmptyMessage(25);
                                return;
                            case 5:
                                MainActivity.e(MainActivity.this).sendEmptyMessage(22);
                                return;
                            case 3:
                                MainActivity.e(MainActivity.this).sendEmptyMessage(23);
                                return;
                        }
                        MainActivity.e(MainActivity.this).sendEmptyMessage(24);
                        return;
                        int i = 0;
                        continue;
                        Object localObject2 = localObject4;
                    }
                }
            }).start();
            return;
        }
        catch (Exception localException)
        {
            for (;;)
            {
                localException.printStackTrace();
            }
        }
    }

    private void J()
    {
        this.aC = true;
        this.ax = new ProgressDialog(this);
        this.ax.setMessage(getString(2131165810));
        this.ax.setCancelable(false);
        this.ax.show();
        new Thread(new Runnable()
        {
            public void run()
            {
                try
                {
                    ab localab = new ab();
                    String str = localab.a(MainActivity.this);
                    i = localab.a(MainActivity.this, this, MainActivity.x(MainActivity.this), str);
                    MainActivity.e(MainActivity.this, false);
                    switch (i)
                    {
                        default:
                            MainActivity.e(MainActivity.this).sendEmptyMessage(16);
                            r.a().a(MainActivity.this, MainActivity.this.p, "自动恢复", "失败-原因未知", null);
                            com.popularapp.periodcalendar.c.b.d().b(MainActivity.this, "首页自动恢复");
                            return;
                    }
                }
                catch (Exception localException)
                {
                    for (;;)
                    {
                        r.a().a(MainActivity.this, "MainActivity", 19, localException, "");
                        localException.printStackTrace();
                        i = -1;
                    }
                }
                catch (Error localError)
                {
                    for (;;)
                    {
                        r.a().a(MainActivity.this, "MainActivity", 20, localError, "");
                        localError.printStackTrace();
                        int i = -1;
                        continue;
                        MainActivity.e(MainActivity.this).sendEmptyMessage(15);
                        r.a().a(MainActivity.this, MainActivity.this.p, "自动恢复", "成功", null);
                        continue;
                        MainActivity.e(MainActivity.this).sendEmptyMessage(10);
                        r.a().a(MainActivity.this, MainActivity.this.p, "自动恢复", "失败-需要升级程序", null);
                        continue;
                        MainActivity.e(MainActivity.this).sendEmptyMessage(25);
                        r.a().a(MainActivity.this, MainActivity.this.p, "自动恢复", "失败-文件错误", null);
                        continue;
                        MainActivity.e(MainActivity.this).sendEmptyMessage(22);
                        r.a().a(MainActivity.this, MainActivity.this.p, "自动恢复", "失败-没有文件", null);
                        continue;
                        MainActivity.e(MainActivity.this).sendEmptyMessage(23);
                        r.a().a(MainActivity.this, MainActivity.this.p, "自动恢复", "失败-文件只读", null);
                        continue;
                        MainActivity.e(MainActivity.this).sendEmptyMessage(24);
                        r.a().a(MainActivity.this, MainActivity.this.p, "自动恢复", "失败-没有空间", null);
                    }
                }
            }
        }).start();
        r.a().a(this, this.p, "自动恢复", "", null);
    }

    private boolean K()
    {
        int k = 1;
        for (;;)
        {
            String[] arrayOfString;
            try
            {
                com.popularapp.periodcalendar.dropbox.a locala = new com.popularapp.periodcalendar.dropbox.a(this);
                int m = com.popularapp.periodcalendar.a.a.ag(this);
                if ((!com.popularapp.periodcalendar.googledrive.a.b(this)) || (m == -1)) {
                    break label261;
                }
                if (m % 5 == 0)
                {
                    i = 1;
                    if ((com.popularapp.periodcalendar.a.a.a == null) || (com.popularapp.periodcalendar.a.a.a.size() <= 0)) {
                        break label266;
                    }
                    j = 1;
                    if ((i == 0) || (!x.a(this)) || (j == 0) || (!com.popularapp.periodcalendar.a.a.W(this).equals("")) || (locala.c())) {
                        break label188;
                    }
                    com.popularapp.periodcalendar.a.a.D(this, m + 1);
                    if (!com.popularapp.periodcalendar.googledrive.a.b(this)) {
                        break label179;
                    }
                    arrayOfString = com.popularapp.periodcalendar.utils.b.b(this);
                    if ((arrayOfString != null) && (arrayOfString.length > 0))
                    {
                        a(arrayOfString, locala);
                        return true;
                    }
                }
                else
                {
                    com.popularapp.periodcalendar.a.a.D(this, m + 1);
                    break label261;
                }
                b(null, locala);
                return true;
            }
            catch (VerifyError localVerifyError)
            {
                localVerifyError.printStackTrace();
                r.a().a(this, "MainActivity", 21, localVerifyError, "");
                return false;
            }
            label179:
            b(null, localVerifyError);
            return true;
            label188:
            String str = com.popularapp.periodcalendar.a.a.W(this);
            if (!str.equals(""))
            {
                arrayOfString = com.popularapp.periodcalendar.utils.b.b(this);
                j = k;
                if (arrayOfString != null) {
                    i = 0;
                }
            }
            for (;;)
            {
                j = k;
                if (i < arrayOfString.length)
                {
                    if (str.equals(arrayOfString[i])) {
                        j = 0;
                    }
                }
                else
                {
                    if (j != 0) {
                        com.popularapp.periodcalendar.a.a.e(this, "");
                    }
                    return false;
                }
                i += 1;
            }
            label261:
            int i = 0;
            continue;
            label266:
            int j = 0;
        }
    }

    private void L()
    {
        com.popularapp.periodcalendar.dropbox.a locala = new com.popularapp.periodcalendar.dropbox.a(this);
        if ((!com.popularapp.periodcalendar.a.a.W(this).equals("")) || (locala.c())) {}
        int i;
        do
        {
            return;
            i = com.popularapp.periodcalendar.a.a.j(this, -2);
            if (i == -2)
            {
                com.popularapp.periodcalendar.a.a.k(this, 0);
                com.popularapp.periodcalendar.a.a.G(this);
                return;
            }
        } while (i < 0);
        new com.popularapp.periodcalendar.dialog.c().a(this, i);
    }

    private GoogleAccountCredential M()
    {
        if (this.aF == null)
        {
            ArrayList localArrayList = new ArrayList();
            localArrayList.add("https://www.googleapis.com/auth/drive.appdata");
            this.aF = GoogleAccountCredential.usingOAuth2(this, localArrayList);
        }
        return this.aF;
    }

    private void N()
    {
        this.T.setVisibility(0);
        if ((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green")))
        {
            this.O.setVisibility(0);
            this.O.setOnClickListener(null);
            this.Q.setGravity(21);
            this.S.setGravity(5);
            localObject = this.a.getLanguage().toLowerCase();
            if (com.popularapp.periodcalendar.a.a.c(this.a))
            {
                this.V.setTypeface(q.a().c(com.popularapp.periodcalendar.d.a.c(this)));
                if (((String)localObject).equals("hi")) {
                    break label210;
                }
                this.V.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361804) * 2.0F / 3.0F);
            }
            for (;;)
            {
                this.V.setVisibility(0);
                this.U.setImageDrawable(com.popularapp.periodcalendar.d.a.b(this, 2130838046));
                this.V.setText(getString(2131165539));
                this.W.setVisibility(8);
                this.O.setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View paramAnonymousView)
                    {
                        MainActivity.z(MainActivity.this);
                    }
                });
                return;
                this.V.setTypeface(Typeface.DEFAULT);
                break;
                label210:
                this.V.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361804) / 2.0F);
            }
        }
        this.V.setVisibility(8);
        this.W.setVisibility(0);
        this.W.setText(getString(2131165539));
        this.W.setCompoundDrawablesWithIntrinsicBounds(com.popularapp.periodcalendar.d.a.b(this, 2130838046), null, null, null);
        Object localObject = (ViewGroup.MarginLayoutParams)this.W.getLayoutParams();
        ((ViewGroup.MarginLayoutParams)localObject).setMargins(0, 0, 0, 0);
        this.W.setLayoutParams((ViewGroup.LayoutParams)localObject);
        this.W.setCompoundDrawablePadding((int)(5.0F * getResources().getDisplayMetrics().density));
        this.W.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                MainActivity.z(MainActivity.this);
            }
        });
    }

    private void O()
    {
        try
        {
            e.a locala = new e.a(this);
            locala.setTitle(getString(2131165648));
            locala.setMessage(getString(2131165647));
            locala.setPositiveButton(getString(2131165320), new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(MainActivity.this.getString(2131166119))));
                }
            });
            locala.setNegativeButton(getString(2131165313), new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    paramAnonymousDialogInterface = new Intent(MainActivity.this, PeriodPredictionActivity.class);
                    paramAnonymousDialogInterface.putExtra("from", 1);
                    MainActivity.this.startActivity(paramAnonymousDialogInterface);
                    MainActivity.this.finish();
                }
            });
            locala.create();
            locala.show();
            return;
        }
        catch (Exception localException)
        {
            r.a().a(this, "MainActivity", 38, localException, "");
            localException.printStackTrace();
        }
    }

    private void P()
    {
        g.a().m = false;
        if ((com.popularapp.periodcalendar.a.a.R(this)) || (com.popularapp.periodcalendar.a.a.Q(this)))
        {
            g.a().e = true;
            Intent localIntent = new Intent(this, AutoBackupService.class);
            com.popularapp.periodcalendar.service.a.a().a(this, Integer.valueOf(4), localIntent);
        }
        com.popularapp.periodcalendar.a.a.m(this, false);
        g.a().i = false;
        finish();
    }

    private void Q()
    {
        try
        {
            r.a().a(this, "恢复错误提示", "格式错误", this.p, null);
            e.a locala = new e.a(this);
            locala.setTitle(getString(2131166000));
            String str = "<br>" + getString(2131166109) + " : <font color='red'>" + 12116 + "</font>";
            locala.setMessage(Html.fromHtml(getString(2131166043, new Object[] { getString(2131165255) }) + str));
            locala.setPositiveButton(getString(2131165681), new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    MainActivity.g(MainActivity.this);
                }
            });
            locala.create();
            locala.show();
            com.popularapp.periodcalendar.c.b.d().b(this, "12116");
            return;
        }
        catch (Exception localException)
        {
            r.a().a(this, "MainActivity", 9, localException, "");
            localException.printStackTrace();
        }
    }

    private void R()
    {
        try
        {
            r.a().a(this, "恢复错误提示", "文件系统损坏", this.p, null);
            e.a locala = new e.a(this);
            locala.setTitle(getString(2131166000));
            String str = "<br>" + getString(2131166109) + " : <font color='red'>" + 12106 + "</font>";
            locala.setMessage(Html.fromHtml((getString(2131165808) + str).replace("\n", "<br>")));
            locala.setPositiveButton(getString(2131165807), new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    paramAnonymousDialogInterface.dismiss();
                }
            });
            locala.setNegativeButton(getString(2131165843), new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    MainActivity.a(MainActivity.this, "");
                    paramAnonymousDialogInterface.dismiss();
                }
            });
            locala.create();
            locala.show();
            com.popularapp.periodcalendar.c.b.d().b(this, "12106");
            return;
        }
        catch (WindowManager.BadTokenException localBadTokenException)
        {
            r.a().a(this, "MainActivity", 67, localBadTokenException, "");
            localBadTokenException.printStackTrace();
        }
    }

    private void S()
    {
        try
        {
            r.a().a(this, "恢复错误提示", "文件只读", this.p, null);
            e.a locala = new e.a(this);
            locala.setTitle(getString(2131166000));
            String str = "<br>" + getString(2131166109) + " : <font color='red'>" + 12105 + "</font>";
            locala.setMessage(Html.fromHtml(getString(2131165813) + str));
            locala.setPositiveButton(getString(2131165681), new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    paramAnonymousDialogInterface.dismiss();
                }
            });
            locala.create();
            locala.show();
            com.popularapp.periodcalendar.c.b.d().b(this, "12105");
            return;
        }
        catch (WindowManager.BadTokenException localBadTokenException)
        {
            r.a().a(this, "MainActivity", 66, localBadTokenException, "");
            localBadTokenException.printStackTrace();
        }
    }

    private void T()
    {
        try
        {
            r.a().a(this, "恢复错误提示", "空间不足", this.p, null);
            e.a locala = new e.a(this);
            locala.setTitle(getString(2131166000));
            String str = "<br>" + getString(2131166109) + " : <font color='red'>" + 12102 + "</font>";
            locala.setMessage(Html.fromHtml((getString(2131165812) + str).replace("\n", "<br>")));
            locala.setPositiveButton(getString(2131165681), new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    paramAnonymousDialogInterface.dismiss();
                }
            });
            locala.create();
            locala.show();
            com.popularapp.periodcalendar.c.b.d().b(this, "12102");
            return;
        }
        catch (WindowManager.BadTokenException localBadTokenException)
        {
            r.a().a(this, "MainActivity", 67, localBadTokenException, "");
            localBadTokenException.printStackTrace();
        }
    }

    private void a(int paramInt, long paramLong, boolean paramBoolean)
    {
        if (!this.g)
        {
            this.g = true;
            if (paramBoolean) {
                r.a().b(this, this.p, "点击日历", "", null);
            }
            Intent localIntent = new Intent(this, CalendarActivity.class);
            localIntent.putExtra("notification_pill_model", paramInt);
            localIntent.putExtra("from", 1);
            localIntent.putExtra("date", paramLong);
            startActivity(localIntent);
            finish();
        }
    }

    private void a(final int paramInt, final String[] paramArrayOfString)
    {
        final String str = Locale.getDefault().getCountry().toLowerCase();
        Object localObject = Locale.getDefault().getLanguage().toLowerCase();
        str = (String)localObject + "_" + str;
        localObject = new e.a(this);
        ((e.a)localObject).setTitle(getString(2131165866));
        ((e.a)localObject).setSingleChoiceItems(paramArrayOfString, 0, new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
                if (paramAnonymousInt == 0)
                {
                    r.a().b(MainActivity.this, MainActivity.this.p, "选择语言", paramArrayOfString[0] + "(" + str + ")", null);
                    u.a(MainActivity.this, paramInt);
                }
                try
                {
                    for (;;)
                    {
                        paramAnonymousDialogInterface.dismiss();
                        MainActivity.h(MainActivity.this);
                        return;
                        r.a().b(MainActivity.this, MainActivity.this.p, "选择语言", paramArrayOfString[1] + "(" + str + ")", null);
                        u.a(MainActivity.this, 0);
                    }
                }
                catch (IllegalArgumentException paramAnonymousDialogInterface)
                {
                    for (;;)
                    {
                        r.a().a(MainActivity.this, "MainActivity", 15, paramAnonymousDialogInterface, "");
                        paramAnonymousDialogInterface.printStackTrace();
                    }
                }
            }
        });
        ((e.a)localObject).setOnCancelListener(new DialogInterface.OnCancelListener()
        {
            public void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
                r.a().b(MainActivity.this, MainActivity.this.p, "选择语言", "取消", null);
                MainActivity.this.finish();
            }
        });
        ((e.a)localObject).create().show();
    }

    private void a(long paramLong)
    {
        String str = this.a.getLanguage().toLowerCase();
        int i = this.au.a(this.au.c(paramLong), this.at);
        if ((i < 1) && (!str.equals("mk")) && (!str.equals("sr")) && (!str.equals("nl")) && (!str.equals("uk")))
        {
            this.K.setVisibility(0);
            this.K.setText(getString(2131165721));
            this.K.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361804));
            this.M.setVisibility(8);
            if (((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green"))) && (com.popularapp.periodcalendar.a.a.c(this.a))) {
                this.K.setTypeface(q.a().c(com.popularapp.periodcalendar.d.a.c(this)));
            }
            return;
        }
        if (str.equals("ja"))
        {
            this.K.setText("");
            if (com.popularapp.periodcalendar.d.a.b(this).equals("")) {
                this.K.setVisibility(0);
            }
            this.M.setVisibility(0);
            if ((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green")))
            {
                this.M.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361806) * 1.2F);
                this.M.setTextColor(com.popularapp.periodcalendar.d.a.d(this, 2131558464));
                this.L.setVisibility(8);
            }
            this.M.setText(getString(u.a(this, i, 2131166060, 2131165532, 2131166061), new Object[] { Integer.valueOf(i) }));
            return;
        }
        this.K.setVisibility(0);
        this.K.setText(String.valueOf(i));
        this.K.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361805));
        this.M.setVisibility(0);
        this.M.setText(getString(u.a(this, i, 2131166060, 2131165532, 2131166061)));
    }

    private void a(long paramLong, boolean paramBoolean)
    {
        if (!this.g)
        {
            this.g = true;
            if (paramBoolean) {
                r.a().b(this, this.p, "点击添加备注", "", null);
            }
            if (!com.popularapp.periodcalendar.d.a.b(this).equals("")) {
                break label124;
            }
        }
        label124:
        for (Intent localIntent = new Intent(this, CalendarEntryActivity134.class);; localIntent = new Intent(this, CalendarEntryActivity.class))
        {
            Calendar localCalendar = Calendar.getInstance();
            localCalendar.setTimeInMillis(paramLong);
            localIntent.putExtra("date", this.au.a(localCalendar.get(1), localCalendar.get(2), localCalendar.get(5)));
            localIntent.putExtra("from", 1);
            startActivity(localIntent);
            finish();
            return;
        }
    }

    private void a(PeriodCompat paramPeriodCompat)
    {
        int i = this.au.c(this, this.av, paramPeriodCompat);
        if (i < 0) {}
        do
        {
            return;
            i = paramPeriodCompat.getPeriod_length() - i;
            if (paramPeriodCompat.getPeriod_length() < 21) {
                break;
            }
            if (i >= Math.abs(paramPeriodCompat.a(true)) + 5 + 1)
            {
                l = this.au.b(paramPeriodCompat.getMenses_start(), i - 5);
                d(this.au.c(l));
                return;
            }
        } while (i < Math.abs(paramPeriodCompat.a(true)) + 1);
        long l = this.au.b(paramPeriodCompat.getMenses_start(), Math.abs(paramPeriodCompat.a(true)) + 1);
        d(this.au.c(l));
        return;
        N();
    }

    private void a(CharSequence paramCharSequence)
    {
        this.M.setVisibility(8);
        this.K.setVisibility(0);
        this.K.setText(paramCharSequence);
        paramCharSequence = this.a.getLanguage().toLowerCase();
        if ((paramCharSequence.equals("ar")) || (paramCharSequence.equals("fa"))) {
            this.K.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361805) * 0.8F);
        }
        for (;;)
        {
            if (((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green"))) && (com.popularapp.periodcalendar.a.a.c(this.a))) {
                this.K.setTypeface(q.a().c(com.popularapp.periodcalendar.d.a.c(this)));
            }
            this.N.setVisibility(0);
            this.N.setText(getString(2131165896));
            this.P.setVisibility(8);
            this.R.setText("");
            this.T.setVisibility(8);
            this.V.setText("");
            return;
            this.K.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361805));
        }
    }

    private void a(String paramString)
    {
        if (!this.g)
        {
            this.g = true;
            r.a().b(this, this.p, "点击怀孕", paramString, null);
            paramString = new Intent(this, PregnancyActivity.class);
            paramString.putExtra("from", 1);
            startActivity(paramString);
            finish();
        }
    }

    private void a(String paramString1, String paramString2)
    {
        this.K.setVisibility(0);
        this.K.setText(paramString1);
        this.K.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361805));
        this.M.setVisibility(0);
        this.M.setText(paramString2);
        this.N.setVisibility(8);
        this.N.setText("");
        this.P.setVisibility(8);
        this.R.setText("");
        this.T.setVisibility(8);
        this.V.setText("");
    }

    private void a(boolean paramBoolean)
    {
        if (com.popularapp.periodcalendar.a.a.a(this).getInt("uid", -1) == -1)
        {
            Object localObject = this.av.a(this, "", false);
            int i = ((ArrayList)localObject).size();
            if ((i == 0) && (G()) && (paramBoolean))
            {
                J();
                com.popularapp.periodcalendar.a.a.m(this, false);
                return;
            }
            if ((i == 0) || ((i == 1) && (((UserCompat)((ArrayList)localObject).get(0)).getUid() == 0)))
            {
                com.popularapp.periodcalendar.a.a.m(this, true);
                if (com.popularapp.periodcalendar.a.a.au(this) == -1)
                {
                    localObject = g.a().y;
                    String str1 = Locale.getDefault().getCountry().toLowerCase();
                    String str2 = Locale.getDefault().getLanguage().toLowerCase();
                    if (str1.equals("in"))
                    {
                        a(31, new String[] { localObject[32], localObject[0] });
                        return;
                    }
                    if (str2.equals("ar"))
                    {
                        com.popularapp.periodcalendar.a.a.f(this, false);
                        a(10, new String[] { localObject[10], localObject[0] });
                        return;
                    }
                    if (str1.equals("ca"))
                    {
                        a(1, new String[] { localObject[1], localObject[0] });
                        return;
                    }
                    if (str1.equals("my"))
                    {
                        a(26, new String[] { localObject[27], localObject[0] });
                        return;
                    }
                    d(true);
                    return;
                }
                d(true);
                return;
            }
            m();
            return;
        }
        m();
    }

    private void a(final String[] paramArrayOfString, final com.popularapp.periodcalendar.dropbox.a parama)
    {
        try
        {
            this.aE = paramArrayOfString[0];
            e.a locala = new e.a(this);
            locala.setTitle(getString(2131165280));
            locala.setSingleChoiceItems(paramArrayOfString, 0, new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    MainActivity.c(MainActivity.this, paramArrayOfString[paramAnonymousInt]);
                }
            });
            locala.setPositiveButton(getString(2131165681), new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    MainActivity.f(MainActivity.this, false);
                }
            });
            locala.setNegativeButton(getString(2131165309), new DialogInterface.OnClickListener()
            {
                public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                {
                    if (parama != null) {
                        MainActivity.a(MainActivity.this, paramArrayOfString, parama);
                    }
                }
            });
            locala.setOnCancelListener(new DialogInterface.OnCancelListener()
            {
                public void onCancel(DialogInterface paramAnonymousDialogInterface)
                {
                    if (parama != null) {
                        MainActivity.a(MainActivity.this, paramArrayOfString, parama);
                    }
                }
            });
            locala.show();
            return;
        }
        catch (Exception paramArrayOfString)
        {
            r.a().a(this, "MainActivity", 22, paramArrayOfString, "");
            paramArrayOfString.printStackTrace();
        }
    }

    private void b(long paramLong)
    {
        String str = this.a.getLanguage().toLowerCase();
        int i = this.au.a(this.at, paramLong);
        if ((str.equals("ru")) || (str.equals("es")) || (str.equals("pt")) || (str.equals("ja")) || (str.equals("th")) || (str.equals("hr")) || (str.equals("uk")))
        {
            this.K.setText("");
            if (com.popularapp.periodcalendar.d.a.b(this).equals("")) {
                this.K.setVisibility(0);
            }
            this.M.setVisibility(0);
            if ((str.equals("ru")) || (str.equals("es")) || (str.equals("pt"))) {
                this.M.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361806) * 1.2F);
            }
            if ((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green")))
            {
                this.M.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361806) * 1.2F);
                this.M.setTextColor(com.popularapp.periodcalendar.d.a.d(this, 2131558464));
                if (!com.popularapp.periodcalendar.a.a.T(this)) {
                    break label312;
                }
                this.M.setGravity(21);
            }
            for (;;)
            {
                this.L.setVisibility(8);
                this.M.setText(getString(u.a(this, i, 2131166064, 2131165534, 2131166065), new Object[] { String.valueOf(i) }));
                return;
                label312:
                this.K.setGravity(17);
            }
        }
        this.K.setVisibility(0);
        this.K.setText(String.valueOf(i));
        this.K.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361805));
        this.M.setVisibility(0);
        this.M.setText(getString(u.a(this, i, 2131166064, 2131165534, 2131166065)));
    }

    private void b(final String paramString)
    {
        this.ax = ProgressDialog.show(this, null, getString(2131165520));
        this.ax.setCancelable(false);
        new Thread(new Runnable()
        {
            /* Error */
            public void run()
            {
                // Byte code:
                //   0: aconst_null
                //   1: astore 5
                //   3: aconst_null
                //   4: astore_3
                //   5: new 29	com/popularapp/periodcalendar/utils/g
                //   8: dup
                //   9: invokespecial 30	com/popularapp/periodcalendar/utils/g:<init>	()V
                //   12: aload_0
                //   13: getfield 18	com/popularapp/periodcalendar/MainActivity$22:b	Lcom/popularapp/periodcalendar/MainActivity;
                //   16: aload_0
                //   17: aload_0
                //   18: getfield 18	com/popularapp/periodcalendar/MainActivity$22:b	Lcom/popularapp/periodcalendar/MainActivity;
                //   21: invokestatic 34	com/popularapp/periodcalendar/MainActivity:y	(Lcom/popularapp/periodcalendar/MainActivity;)Lcom/popularapp/periodcalendar/a/b;
                //   24: aload_0
                //   25: getfield 18	com/popularapp/periodcalendar/MainActivity$22:b	Lcom/popularapp/periodcalendar/MainActivity;
                //   28: invokestatic 38	com/popularapp/periodcalendar/MainActivity:x	(Lcom/popularapp/periodcalendar/MainActivity;)Lcom/popularapp/periodcalendar/a/f;
                //   31: aload_0
                //   32: getfield 18	com/popularapp/periodcalendar/MainActivity$22:b	Lcom/popularapp/periodcalendar/MainActivity;
                //   35: invokestatic 43	com/popularapp/periodcalendar/utils/p:a	(Landroid/content/Context;)Ljava/lang/String;
                //   38: iconst_0
                //   39: invokevirtual 46	com/popularapp/periodcalendar/utils/g:a	(Landroid/content/Context;Ljava/lang/Runnable;Lcom/popularapp/periodcalendar/a/b;Lcom/popularapp/periodcalendar/a/f;Ljava/lang/String;Z)Ljava/lang/String;
                //   42: astore_2
                //   43: new 48	java/io/File
                //   46: dup
                //   47: new 50	java/lang/StringBuilder
                //   50: dup
                //   51: invokespecial 51	java/lang/StringBuilder:<init>	()V
                //   54: aload_0
                //   55: getfield 18	com/popularapp/periodcalendar/MainActivity$22:b	Lcom/popularapp/periodcalendar/MainActivity;
                //   58: invokestatic 53	com/popularapp/periodcalendar/utils/p:b	(Landroid/content/Context;)Ljava/lang/String;
                //   61: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   64: ldc 59
                //   66: invokevirtual 57	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   69: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
                //   72: invokespecial 65	java/io/File:<init>	(Ljava/lang/String;)V
                //   75: astore 4
                //   77: aload 4
                //   79: invokevirtual 69	java/io/File:exists	()Z
                //   82: ifne +9 -> 91
                //   85: aload 4
                //   87: invokevirtual 72	java/io/File:createNewFile	()Z
                //   90: pop
                //   91: new 74	java/io/FileInputStream
                //   94: dup
                //   95: new 48	java/io/File
                //   98: dup
                //   99: aload_2
                //   100: invokespecial 65	java/io/File:<init>	(Ljava/lang/String;)V
                //   103: invokespecial 77	java/io/FileInputStream:<init>	(Ljava/io/File;)V
                //   106: astore_2
                //   107: new 79	java/io/FileOutputStream
                //   110: dup
                //   111: aload 4
                //   113: invokespecial 80	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
                //   116: astore_3
                //   117: sipush 4096
                //   120: newarray <illegal type>
                //   122: astore 4
                //   124: aload_2
                //   125: aload 4
                //   127: invokevirtual 84	java/io/FileInputStream:read	([B)I
                //   130: istore_1
                //   131: iload_1
                //   132: iconst_m1
                //   133: if_icmpeq +102 -> 235
                //   136: aload_3
                //   137: aload 4
                //   139: iconst_0
                //   140: iload_1
                //   141: invokevirtual 88	java/io/FileOutputStream:write	([BII)V
                //   144: goto -20 -> 124
                //   147: astore 5
                //   149: aload_3
                //   150: astore 4
                //   152: aload_2
                //   153: astore_3
                //   154: aload 4
                //   156: astore_2
                //   157: aload 5
                //   159: astore 4
                //   161: invokestatic 93	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
                //   164: aload_0
                //   165: getfield 18	com/popularapp/periodcalendar/MainActivity$22:b	Lcom/popularapp/periodcalendar/MainActivity;
                //   168: ldc 95
                //   170: bipush 27
                //   172: aload 4
                //   174: ldc 97
                //   176: invokevirtual 100	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
                //   179: aload 4
                //   181: invokevirtual 103	java/io/IOException:printStackTrace	()V
                //   184: aload_2
                //   185: ifnull +11 -> 196
                //   188: aload_2
                //   189: invokevirtual 106	java/io/FileOutputStream:flush	()V
                //   192: aload_2
                //   193: invokevirtual 109	java/io/FileOutputStream:close	()V
                //   196: aload_3
                //   197: ifnull +7 -> 204
                //   200: aload_3
                //   201: invokevirtual 110	java/io/FileInputStream:close	()V
                //   204: invokestatic 116	android/os/Message:obtain	()Landroid/os/Message;
                //   207: astore_2
                //   208: aload_2
                //   209: bipush 14
                //   211: putfield 120	android/os/Message:what	I
                //   214: aload_2
                //   215: aload_0
                //   216: getfield 20	com/popularapp/periodcalendar/MainActivity$22:a	Ljava/lang/String;
                //   219: putfield 124	android/os/Message:obj	Ljava/lang/Object;
                //   222: aload_0
                //   223: getfield 18	com/popularapp/periodcalendar/MainActivity$22:b	Lcom/popularapp/periodcalendar/MainActivity;
                //   226: invokestatic 128	com/popularapp/periodcalendar/MainActivity:e	(Lcom/popularapp/periodcalendar/MainActivity;)Landroid/os/Handler;
                //   229: aload_2
                //   230: invokevirtual 134	android/os/Handler:sendMessage	(Landroid/os/Message;)Z
                //   233: pop
                //   234: return
                //   235: aload_3
                //   236: ifnull +11 -> 247
                //   239: aload_3
                //   240: invokevirtual 106	java/io/FileOutputStream:flush	()V
                //   243: aload_3
                //   244: invokevirtual 109	java/io/FileOutputStream:close	()V
                //   247: aload_2
                //   248: ifnull -44 -> 204
                //   251: aload_2
                //   252: invokevirtual 110	java/io/FileInputStream:close	()V
                //   255: goto -51 -> 204
                //   258: astore_2
                //   259: invokestatic 93	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
                //   262: aload_0
                //   263: getfield 18	com/popularapp/periodcalendar/MainActivity$22:b	Lcom/popularapp/periodcalendar/MainActivity;
                //   266: ldc 95
                //   268: bipush 28
                //   270: aload_2
                //   271: ldc 97
                //   273: invokevirtual 100	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
                //   276: aload_2
                //   277: invokevirtual 103	java/io/IOException:printStackTrace	()V
                //   280: goto -76 -> 204
                //   283: astore_2
                //   284: invokestatic 93	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
                //   287: aload_0
                //   288: getfield 18	com/popularapp/periodcalendar/MainActivity$22:b	Lcom/popularapp/periodcalendar/MainActivity;
                //   291: ldc 95
                //   293: bipush 28
                //   295: aload_2
                //   296: ldc 97
                //   298: invokevirtual 100	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
                //   301: aload_2
                //   302: invokevirtual 103	java/io/IOException:printStackTrace	()V
                //   305: goto -101 -> 204
                //   308: astore_2
                //   309: aconst_null
                //   310: astore_3
                //   311: aload 5
                //   313: astore 4
                //   315: aload 4
                //   317: ifnull +13 -> 330
                //   320: aload 4
                //   322: invokevirtual 106	java/io/FileOutputStream:flush	()V
                //   325: aload 4
                //   327: invokevirtual 109	java/io/FileOutputStream:close	()V
                //   330: aload_3
                //   331: ifnull +7 -> 338
                //   334: aload_3
                //   335: invokevirtual 110	java/io/FileInputStream:close	()V
                //   338: aload_2
                //   339: athrow
                //   340: astore_3
                //   341: invokestatic 93	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
                //   344: aload_0
                //   345: getfield 18	com/popularapp/periodcalendar/MainActivity$22:b	Lcom/popularapp/periodcalendar/MainActivity;
                //   348: ldc 95
                //   350: bipush 28
                //   352: aload_3
                //   353: ldc 97
                //   355: invokevirtual 100	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
                //   358: aload_3
                //   359: invokevirtual 103	java/io/IOException:printStackTrace	()V
                //   362: goto -24 -> 338
                //   365: astore 4
                //   367: aload_2
                //   368: astore_3
                //   369: aload 4
                //   371: astore_2
                //   372: aload 5
                //   374: astore 4
                //   376: goto -61 -> 315
                //   379: astore 4
                //   381: aload_3
                //   382: astore 5
                //   384: aload_2
                //   385: astore_3
                //   386: aload 4
                //   388: astore_2
                //   389: aload 5
                //   391: astore 4
                //   393: goto -78 -> 315
                //   396: astore 5
                //   398: aload_2
                //   399: astore 4
                //   401: aload 5
                //   403: astore_2
                //   404: goto -89 -> 315
                //   407: astore 4
                //   409: aconst_null
                //   410: astore_2
                //   411: goto -250 -> 161
                //   414: astore 4
                //   416: aconst_null
                //   417: astore 5
                //   419: aload_2
                //   420: astore_3
                //   421: aload 5
                //   423: astore_2
                //   424: goto -263 -> 161
                // Local variable table:
                //   start	length	slot	name	signature
                //   0	427	0	this	22
                //   130	11	1	i	int
                //   42	210	2	localObject1	Object
                //   258	19	2	localIOException1	IOException
                //   283	19	2	localIOException2	IOException
                //   308	60	2	localObject2	Object
                //   371	53	2	localObject3	Object
                //   4	331	3	localObject4	Object
                //   340	19	3	localIOException3	IOException
                //   368	53	3	localObject5	Object
                //   75	251	4	localObject6	Object
                //   365	5	4	localObject7	Object
                //   374	1	4	localIOException4	IOException
                //   379	8	4	localObject8	Object
                //   391	9	4	localObject9	Object
                //   407	1	4	localIOException5	IOException
                //   414	1	4	localIOException6	IOException
                //   1	1	5	localObject10	Object
                //   147	226	5	localIOException7	IOException
                //   382	8	5	localObject11	Object
                //   396	6	5	localObject12	Object
                //   417	5	5	localObject13	Object
                // Exception table:
                //   from	to	target	type
                //   117	124	147	java/io/IOException
                //   124	131	147	java/io/IOException
                //   136	144	147	java/io/IOException
                //   239	247	258	java/io/IOException
                //   251	255	258	java/io/IOException
                //   188	196	283	java/io/IOException
                //   200	204	283	java/io/IOException
                //   77	91	308	finally
                //   91	107	308	finally
                //   320	330	340	java/io/IOException
                //   334	338	340	java/io/IOException
                //   107	117	365	finally
                //   117	124	379	finally
                //   124	131	379	finally
                //   136	144	379	finally
                //   161	184	396	finally
                //   77	91	407	java/io/IOException
                //   91	107	407	java/io/IOException
                //   107	117	414	java/io/IOException
            }
        }).start();
    }

    private void b(final boolean paramBoolean)
    {
        try
        {
            this.ax = new ProgressDialog(this);
            this.ax.setMessage(getString(2131165523) + "...");
            this.ax.show();
            this.aA = true;
            new Thread(new Runnable()
            {
                public void run()
                {
                    for (;;)
                    {
                        Message localMessage6;
                        try
                        {
                            localObject1 = com.popularapp.periodcalendar.googledrive.a.a(MainActivity.v(MainActivity.this), MainActivity.this, MainActivity.w(MainActivity.this)).files().list();
                            ((Drive.Files.List)localObject1).setQ("'appdata' in parents");
                            localObject3 = (FileList)((Drive.Files.List)localObject1).execute();
                            localMessage7 = Message.obtain();
                            localMessage7.what = 18;
                            if (localObject3 == null) {
                                continue;
                            }
                            localMessage7.arg1 = 1;
                            com.popularapp.periodcalendar.a.a.e(MainActivity.this, MainActivity.w(MainActivity.this));
                            localObject1 = null;
                            Iterator localIterator = ((FileList)localObject3).getItems().iterator();
                            if (localIterator.hasNext())
                            {
                                com.google.api.services.drive.model.File localFile = (com.google.api.services.drive.model.File)localIterator.next();
                                localObject3 = localObject1;
                                if (localFile.getDescription() == null) {
                                    break label1130;
                                }
                                localObject3 = localObject1;
                                if (localObject1 == null) {
                                    localObject3 = localFile;
                                }
                                long l1 = ((com.google.api.services.drive.model.File)localObject3).getModifiedDate().getValue();
                                long l2 = localFile.getModifiedDate().getValue();
                                if (l1 >= l2) {
                                    break label1130;
                                }
                                localObject1 = localFile;
                                continue;
                            }
                            if (localObject1 == null) {}
                        }
                        catch (UserRecoverableAuthIOException localUserRecoverableAuthIOException)
                        {
                            Object localObject1;
                            Object localObject3;
                            Message localMessage7;
                            if (paramBoolean) {
                                continue;
                            }
                            try
                            {
                                localUserRecoverableAuthIOException.printStackTrace();
                                localObject3 = Message.obtain();
                                ((Message)localObject3).what = 18;
                                ((Message)localObject3).arg1 = 2;
                                ((Message)localObject3).obj = localUserRecoverableAuthIOException.getIntent();
                                MainActivity.e(MainActivity.this).sendMessage((Message)localObject3);
                                return;
                            }
                            catch (NullPointerException localNullPointerException2)
                            {
                                localUserRecoverableAuthIOException.printStackTrace();
                                r.a().a(MainActivity.this, "MainActivity", 30, localUserRecoverableAuthIOException, "");
                                Message localMessage1 = Message.obtain();
                                localMessage1.what = 18;
                                localMessage1.arg1 = 4;
                                localMessage1.obj = "intent_null";
                                MainActivity.e(MainActivity.this).sendMessage(localMessage1);
                                return;
                            }
                            localMessage7.arg1 = 3;
                            continue;
                        }
                        catch (IOException localIOException)
                        {
                            if (paramBoolean) {
                                continue;
                            }
                            if ((localIOException.getMessage() + "").equals("NetworkError")) {
                                continue;
                            }
                            r.a().a(MainActivity.this, "MainActivity", 31, localIOException, "");
                            localMessage6 = Message.obtain();
                            localMessage6.what = 18;
                            localMessage6.arg1 = 4;
                            localMessage6.obj = "IO";
                            MainActivity.e(MainActivity.this).sendMessage(localMessage6);
                            localIOException.printStackTrace();
                            return;
                            Message localMessage2 = Message.obtain();
                            localMessage2.what = 18;
                            localMessage2.arg1 = 1;
                            MainActivity.e(MainActivity.this).sendMessage(localMessage2);
                            return;
                            localMessage6 = Message.obtain();
                            localMessage6.what = 18;
                            localMessage6.arg1 = 1;
                            MainActivity.e(MainActivity.this).sendMessage(localMessage6);
                            continue;
                        }
                        catch (NullPointerException localNullPointerException1)
                        {
                            if (paramBoolean) {
                                continue;
                            }
                            r.a().a(MainActivity.this, "MainActivity", 32, localNullPointerException1, "");
                            localMessage6 = Message.obtain();
                            localMessage6.what = 18;
                            localMessage6.arg1 = 4;
                            localMessage6.obj = "NullPoint";
                            MainActivity.e(MainActivity.this).sendMessage(localMessage6);
                            localNullPointerException1.printStackTrace();
                            return;
                            localMessage6 = Message.obtain();
                            localMessage6.what = 18;
                            localMessage6.arg1 = 1;
                            MainActivity.e(MainActivity.this).sendMessage(localMessage6);
                            continue;
                        }
                        catch (SecurityException localSecurityException)
                        {
                            localSecurityException.printStackTrace();
                            if (paramBoolean) {
                                continue;
                            }
                            r.a().a(MainActivity.this, "MainActivity", 33, localSecurityException, "");
                            Message localMessage3 = Message.obtain();
                            localMessage3.what = 18;
                            localMessage3.arg1 = 4;
                            localMessage3.obj = "Security";
                            MainActivity.e(MainActivity.this).sendMessage(localMessage3);
                            return;
                            localMessage3 = Message.obtain();
                            localMessage3.what = 18;
                            localMessage3.arg1 = 1;
                            MainActivity.e(MainActivity.this).sendMessage(localMessage3);
                            return;
                        }
                        catch (IllegalArgumentException localIllegalArgumentException)
                        {
                            localIllegalArgumentException.printStackTrace();
                            if (paramBoolean) {
                                continue;
                            }
                            r.a().a(MainActivity.this, "MainActivity", 34, localIllegalArgumentException, "");
                            Message localMessage4 = Message.obtain();
                            localMessage4.what = 18;
                            localMessage4.arg1 = 4;
                            localMessage4.obj = "IllegalArgument";
                            MainActivity.e(MainActivity.this).sendMessage(localMessage4);
                            return;
                            localMessage4 = Message.obtain();
                            localMessage4.what = 18;
                            localMessage4.arg1 = 1;
                            MainActivity.e(MainActivity.this).sendMessage(localMessage4);
                            return;
                        }
                        catch (NoSuchFieldError localNoSuchFieldError)
                        {
                            localNoSuchFieldError.printStackTrace();
                            if (paramBoolean) {
                                continue;
                            }
                            r.a().a(MainActivity.this, "MainActivity", 35, localNoSuchFieldError, "");
                            Message localMessage5 = Message.obtain();
                            localMessage5.what = 18;
                            localMessage5.arg1 = 4;
                            localMessage5.obj = "NoSuchField";
                            MainActivity.e(MainActivity.this).sendMessage(localMessage5);
                            return;
                            localMessage5 = Message.obtain();
                            localMessage5.what = 18;
                            localMessage5.arg1 = 1;
                            MainActivity.e(MainActivity.this).sendMessage(localMessage5);
                            return;
                        }
                        catch (Exception localException2)
                        {
                            localException2.printStackTrace();
                            if (paramBoolean) {
                                continue;
                            }
                            r.a().a(MainActivity.this, "MainActivity", 36, localException2, "");
                            localObject2 = Message.obtain();
                            ((Message)localObject2).what = 18;
                            ((Message)localObject2).arg1 = 4;
                            ((Message)localObject2).obj = "other";
                            MainActivity.e(MainActivity.this).sendMessage((Message)localObject2);
                            return;
                            localObject2 = Message.obtain();
                            ((Message)localObject2).what = 18;
                            ((Message)localObject2).arg1 = 1;
                            MainActivity.e(MainActivity.this).sendMessage((Message)localObject2);
                            return;
                        }
                        try
                        {
                            localObject1 = com.popularapp.periodcalendar.googledrive.a.a(com.popularapp.periodcalendar.googledrive.a.a(MainActivity.v(MainActivity.this), MainActivity.this, MainActivity.w(MainActivity.this)).getRequestFactory().buildGetRequest(new GenericUrl(((com.google.api.services.drive.model.File)localObject1).getDownloadUrl())).execute().getContent(), MainActivity.this, "GoogleDrive.pc");
                            if ((!((String)localObject1).equals("")) && (com.popularapp.periodcalendar.a.a.X(MainActivity.this) < p.e(MainActivity.this, (String)localObject1))) {
                                localMessage7.obj = localObject1;
                            }
                            MainActivity.e(MainActivity.this).sendMessage(localMessage7);
                            return;
                        }
                        catch (Exception localException1)
                        {
                            r.a().a(MainActivity.this, "MainActivity", 29, localException1, "");
                            localException1.printStackTrace();
                            continue;
                        }
                        label1130:
                        Object localObject2 = localMessage6;
                    }
                }
            }).start();
            return;
        }
        catch (Exception localException)
        {
            for (;;)
            {
                localException.printStackTrace();
            }
        }
    }

    private void b(final String[] paramArrayOfString, final com.popularapp.periodcalendar.dropbox.a parama)
    {
        boolean bool2 = false;
        boolean bool1 = bool2;
        if (paramArrayOfString != null)
        {
            bool1 = bool2;
            if (paramArrayOfString.length > 0) {
                bool1 = true;
            }
        }
        try
        {
            final d locald = new d(this, bool1);
            locald.setCanceledOnTouchOutside(false);
            locald.show();
            if (bool1) {
                locald.b().setOnClickListener(new View.OnClickListener()
                {
                    public void onClick(View paramAnonymousView)
                    {
                        MainActivity.b(MainActivity.this, paramArrayOfString, null);
                        try
                        {
                            locald.dismiss();
                            return;
                        }
                        catch (Exception paramAnonymousView)
                        {
                            r.a().a(MainActivity.this, "MainActivity", 23, paramAnonymousView, "");
                            paramAnonymousView.printStackTrace();
                        }
                    }
                });
            }
            locald.a().setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View paramAnonymousView)
                {
                    MainActivity.d(MainActivity.this, true);
                    parama.a();
                    try
                    {
                        locald.dismiss();
                        return;
                    }
                    catch (Exception paramAnonymousView)
                    {
                        r.a().a(MainActivity.this, "MainActivity", 24, paramAnonymousView, "");
                        paramAnonymousView.printStackTrace();
                    }
                }
            });
            locald.c().setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View paramAnonymousView)
                {
                    try
                    {
                        locald.dismiss();
                        return;
                    }
                    catch (Exception paramAnonymousView)
                    {
                        r.a().a(MainActivity.this, "MainActivity", 25, paramAnonymousView, "");
                        paramAnonymousView.printStackTrace();
                    }
                }
            });
            locald.d().setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View paramAnonymousView)
                {
                    com.popularapp.periodcalendar.a.a.D(MainActivity.this, -1);
                    try
                    {
                        locald.dismiss();
                        return;
                    }
                    catch (Exception paramAnonymousView)
                    {
                        r.a().a(MainActivity.this, "MainActivity", 26, paramAnonymousView, "");
                        paramAnonymousView.printStackTrace();
                    }
                }
            });
            return;
        }
        catch (Exception paramArrayOfString)
        {
            paramArrayOfString.printStackTrace();
        }
    }

    private void c(int paramInt)
    {
        String str = this.a.getLanguage().toLowerCase();
        if ((str.equals("ja")) || (str.equals("ko")))
        {
            this.K.setVisibility(0);
            this.K.setText(getString(2131165541, new Object[] { this.au.a(paramInt, this.a) }));
            this.K.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361805) * 0.6F);
            this.M.setVisibility(8);
            return;
        }
        if ((str.equals("ar")) || (str.equals("in")) || (str.equals("ro")) || (str.equals("tr")))
        {
            this.K.setVisibility(0);
            this.K.setText(getString(2131165541, new Object[] { this.au.a(paramInt, this.a) }));
            this.K.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361805) * 0.5F);
            this.M.setVisibility(8);
            return;
        }
        if (str.equals("fr"))
        {
            this.K.setVisibility(0);
            this.K.setText(this.au.a(paramInt, this.a));
            this.K.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361805));
            this.M.setVisibility(0);
            if (paramInt == 1)
            {
                this.M.setText("er " + getString(2131165541));
                return;
            }
            this.M.setText("ème " + getString(2131165541));
            return;
        }
        this.K.setVisibility(0);
        this.K.setText(this.au.a(paramInt, this.a));
        this.K.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361805));
        this.M.setVisibility(0);
        this.M.setText(getString(2131165541));
    }

    private void c(long paramLong)
    {
        if ((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green"))) {
            this.O.setVisibility(0);
        }
        this.P.setVisibility(0);
        if (u.a(this.a))
        {
            this.R.setText(this.au.b(this, paramLong, this.a) + " ");
            return;
        }
        this.R.setText(this.au.b(this, paramLong, this.a));
    }

    private void c(final boolean paramBoolean)
    {
        try
        {
            e.a locala = new e.a(this);
            locala.setTitle(getString(2131166000));
            if (paramBoolean) {
                locala.setMessage(getString(2131165632));
            }
            for (;;)
            {
                locala.setPositiveButton(getString(2131165821), new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
                    {
                        if (x.a(MainActivity.this))
                        {
                            if (paramBoolean)
                            {
                                MainActivity.u(MainActivity.this);
                                return;
                            }
                            MainActivity.f(MainActivity.this, false);
                            return;
                        }
                        MainActivity.b(MainActivity.this, paramBoolean);
                    }
                });
                locala.setNegativeButton(getString(2131165309), null);
                locala.create();
                locala.show();
                return;
                locala.setMessage(getString(2131165259));
            }
            return;
        }
        catch (Exception localException)
        {
            localException.printStackTrace();
            r.a().a(this, "MainActivity", 37, localException, "");
        }
    }

    private void d(long paramLong)
    {
        this.T.setVisibility(0);
        this.V.setVisibility(0);
        if (u.a(this.a)) {
            this.V.setText(this.au.b(this, paramLong, this.a) + " ");
        }
        for (;;)
        {
            this.W.setVisibility(0);
            this.W.setText(getString(2131165539));
            if ((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green")))
            {
                this.O.setVisibility(0);
                this.O.setOnClickListener(null);
                this.V.setTypeface(q.a().b(com.popularapp.periodcalendar.d.a.c(this)));
                this.Q.setGravity(21);
                this.S.setGravity(5);
                this.V.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361804));
            }
            return;
            this.V.setText(this.au.b(this, paramLong, this.a));
        }
    }

    private void d(boolean paramBoolean)
    {
        g.a().j = this;
        Intent localIntent = new Intent(this, NewUserActivity.class);
        localIntent.putExtra("isNewUser", paramBoolean);
        startActivity(localIntent);
    }

    private void m()
    {
        this.aB = false;
        this.aQ.sendEmptyMessageAtTime(2, 100L);
    }

    private void n()
    {
        if (System.currentTimeMillis() - i.j(this) > 0L)
        {
            Intent localIntent = new Intent(this, AutoCheckUpdateConfigService.class);
            com.popularapp.periodcalendar.service.a.a().a(this, Integer.valueOf(2), localIntent);
        }
    }

    private void o()
    {
        this.X = ((RelativeLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624537)));
        this.Z = ((RelativeLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624540)));
        this.ab = ((RelativeLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624543)));
        this.ad = ((RelativeLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624546)));
        this.af = ((RelativeLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624549)));
        int m;
        int n;
        float f9;
        int i;
        float f7;
        float f5;
        float f4;
        float f3;
        float f2;
        float f1;
        float f6;
        if (com.popularapp.periodcalendar.d.a.b(this).equals(""))
        {
            m = getResources().getDisplayMetrics().widthPixels;
            n = getResources().getDisplayMetrics().heightPixels;
            f9 = getResources().getDisplayMetrics().density;
            if (m > 240) {
                break label1022;
            }
            i = 292;
            f7 = 75.0F;
            f5 = 28.0F;
            f4 = 29.3F;
            f3 = 18.7F;
            f2 = 36.0F;
            f1 = 129.3F;
            f6 = 54.7F;
        }
        for (;;)
        {
            float f10 = i / (f6 + 140.0F + f3 + 5.0F * f2);
            int j = (int)(com.popularapp.periodcalendar.utils.c.h(this).b() * getResources().getDisplayMetrics().density + 0.5F);
            int k = com.google.android.gms.ads.AdSize.SMART_BANNER.getHeightInPixels(this);
            if (j < k) {
                j = k;
            }
            for (;;)
            {
                j = (int)(n - j - (int)(getResources().getDimension(2131361808) + 0.5F) - 30.0F * f9);
                float f8 = getResources().getDimension(2131361809);
                f6 = f8;
                Object localObject2;
                if ((m - 2.0F * f8) / j > f10)
                {
                    localObject1 = (RelativeLayout)findViewById(2131624516);
                    localObject2 = (ViewGroup.MarginLayoutParams)((RelativeLayout)localObject1).getLayoutParams();
                    f6 = (m - j * f10) / 2.0F;
                    j = (int)f6;
                    ((ViewGroup.MarginLayoutParams)localObject2).rightMargin = j;
                    ((ViewGroup.MarginLayoutParams)localObject2).leftMargin = j;
                    ((RelativeLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
                }
                f6 = (m - f6 * 2.0F) / (i * f9);
                this.ak = ((LinearLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624531)));
                this.an = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624533)));
                this.am = ((ImageView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624534)));
                Object localObject1 = (ViewGroup.MarginLayoutParams)this.am.getLayoutParams();
                ((ViewGroup.MarginLayoutParams)localObject1).width = ((int)(f1 * f9 * f6));
                ((ViewGroup.MarginLayoutParams)localObject1).height = ((int)(140.0F * f9 * f6));
                ((ViewGroup.MarginLayoutParams)localObject1).rightMargin = ((int)(-11.0F * f9));
                this.am.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                this.ak.setBackgroundDrawable(com.popularapp.periodcalendar.d.a.b(this, 2130837601));
                switch (com.popularapp.periodcalendar.a.a.a(this).getInt("pet_index", 0))
                {
                }
                for (;;)
                {
                    localObject1 = (RelativeLayout)findViewById(2131624518);
                    localObject2 = ((RelativeLayout)localObject1).getLayoutParams();
                    ((ViewGroup.LayoutParams)localObject2).width = ((int)(i * f9 * f6));
                    ((ViewGroup.LayoutParams)localObject2).height = ((int)(f7 * f9 * f6));
                    ((RelativeLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
                    localObject1 = (RelativeLayout)findViewById(2131624522);
                    localObject2 = ((RelativeLayout)localObject1).getLayoutParams();
                    ((ViewGroup.LayoutParams)localObject2).width = ((int)(i * f9 * f6));
                    ((ViewGroup.LayoutParams)localObject2).height = ((int)(f5 * f9 * f6));
                    ((RelativeLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
                    localObject1 = (RelativeLayout)findViewById(2131624526);
                    localObject2 = ((RelativeLayout)localObject1).getLayoutParams();
                    ((ViewGroup.LayoutParams)localObject2).width = ((int)(i * f9 * f6));
                    ((ViewGroup.LayoutParams)localObject2).height = ((int)(f4 * f9 * f6));
                    ((RelativeLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
                    localObject1 = (ImageView)findViewById(2131624536);
                    localObject2 = ((ImageView)localObject1).getLayoutParams();
                    ((ViewGroup.LayoutParams)localObject2).width = ((int)(i * f9 * f6));
                    ((ViewGroup.LayoutParams)localObject2).height = ((int)(f3 * f9 * f6));
                    ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
                    localObject1 = this.X.getLayoutParams();
                    ((ViewGroup.LayoutParams)localObject1).width = ((int)(i * f9 * f6));
                    ((ViewGroup.LayoutParams)localObject1).height = ((int)(f2 * f9 * f6));
                    this.X.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                    localObject1 = this.Z.getLayoutParams();
                    ((ViewGroup.LayoutParams)localObject1).width = ((int)(i * f9 * f6));
                    ((ViewGroup.LayoutParams)localObject1).height = ((int)(f2 * f9 * f6));
                    this.Z.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                    localObject1 = this.ab.getLayoutParams();
                    ((ViewGroup.LayoutParams)localObject1).width = ((int)(i * f9 * f6));
                    ((ViewGroup.LayoutParams)localObject1).height = ((int)(f2 * f9 * f6));
                    this.ab.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                    localObject1 = this.ad.getLayoutParams();
                    ((ViewGroup.LayoutParams)localObject1).width = ((int)(i * f9 * f6));
                    ((ViewGroup.LayoutParams)localObject1).height = ((int)(f2 * f9 * f6));
                    this.ad.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                    localObject1 = this.af.getLayoutParams();
                    ((ViewGroup.LayoutParams)localObject1).width = ((int)(i * f9 * f6));
                    ((ViewGroup.LayoutParams)localObject1).height = ((int)(f6 * (f2 * f9)));
                    this.af.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                    return;
                    label1022:
                    if (m > 320) {
                        break label1150;
                    }
                    i = 293;
                    f7 = 75.0F;
                    f5 = 30.7F;
                    f4 = 34.7F;
                    f3 = 19.0F;
                    f2 = 41.0F;
                    f1 = 129.0F;
                    f6 = 61.0F;
                    break;
                    this.am.setImageResource(2130838059);
                    continue;
                    this.am.setImageResource(2130838060);
                    continue;
                    this.am.setImageResource(2130838061);
                    continue;
                    this.am.setVisibility(4);
                    this.ak.setBackgroundDrawable(com.popularapp.periodcalendar.d.a.b(this, 2130837602));
                    continue;
                    this.am.setImageResource(2130838062);
                }
            }
            label1150:
            i = 294;
            f7 = 88.0F;
            f5 = 36.7F;
            f4 = 40.7F;
            f3 = 18.7F;
            f2 = 48.7F;
            f1 = 128.0F;
            f6 = 72.0F;
        }
    }

    private void p()
    {
        if (this.as != null)
        {
            this.as.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View paramAnonymousView)
                {
                    com.popularapp.periodcalendar.utils.w.b(MainActivity.this);
                    r.a().a(MainActivity.this, "广告墙", "点击", "", null);
                }
            });
            Object localObject = AnimationUtils.loadAnimation(this, 2130968586);
            ((Animation)localObject).reset();
            ((Animation)localObject).setFillAfter(true);
            this.ar.startAnimation((Animation)localObject);
            localObject = (ImageView)findViewById(2131624512);
            Animation localAnimation = AnimationUtils.loadAnimation(this, 2130968587);
            localAnimation.setDuration(new Random().nextInt(600) + 500);
            localAnimation.reset();
            ((ImageView)localObject).startAnimation(localAnimation);
            localObject = (ImageView)findViewById(2131624513);
            localAnimation = AnimationUtils.loadAnimation(this, 2130968587);
            localAnimation.setDuration(new Random().nextInt(400) + 500);
            localAnimation.reset();
            ((ImageView)localObject).startAnimation(localAnimation);
            localObject = (ImageView)findViewById(2131624514);
            localAnimation = AnimationUtils.loadAnimation(this, 2130968587);
            localAnimation.setDuration(new Random().nextInt(500) + 400);
            localAnimation.reset();
            ((ImageView)localObject).startAnimation(localAnimation);
            localObject = (ImageView)findViewById(2131624515);
            localAnimation = AnimationUtils.loadAnimation(this, 2130968587);
            localAnimation.setDuration(new Random().nextInt(400) + 600);
            localAnimation.reset();
            ((ImageView)localObject).startAnimation(localAnimation);
        }
    }

    private void q()
    {
        new Thread(new Runnable()
        {
            public void run()
            {
                if (MainActivity.o(MainActivity.this))
                {
                    MainActivity.d(MainActivity.this, false);
                    new com.popularapp.periodcalendar.dropbox.a(MainActivity.this).e();
                }
            }
        }).start();
    }

    private void r()
    {
        this.Q = ((LinearLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624552)));
        this.O = ((LinearLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624553)));
        this.ao = ((LinearLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624554)));
        this.ap = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624555)));
        this.aq = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624556)));
        this.ah = ((RelativeLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624559)));
        this.ai = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624557)));
        this.aj = ((RelativeLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624560)));
    }

    private void s()
    {
        if (com.popularapp.periodcalendar.a.a.Z(this)) {
            Toast.makeText(this, "app generation： " + com.popularapp.periodcalendar.a.a.X(this), 0).show();
        }
        com.popularapp.periodcalendar.a.a.d(this);
        try
        {
            if (getIntent().getBooleanExtra("open_app", false))
            {
                this.av.b(this);
                if ((com.popularapp.periodcalendar.a.a.a.size() > 0) && (!((PeriodCompat)com.popularapp.periodcalendar.a.a.a.get(0)).isPregnancy()))
                {
                    int i = com.popularapp.periodcalendar.a.a.d.b(this, (PeriodCompat)com.popularapp.periodcalendar.a.a.a.get(0));
                    if ((((PeriodCompat)com.popularapp.periodcalendar.a.a.a.get(0)).getPeriod_length() != i) && (i > Math.abs(((PeriodCompat)com.popularapp.periodcalendar.a.a.a.get(0)).a(true)) + 1))
                    {
                        ((PeriodCompat)com.popularapp.periodcalendar.a.a.a.get(0)).setPeriod_length(i);
                        com.popularapp.periodcalendar.a.a.d.a(this, (PeriodCompat)com.popularapp.periodcalendar.a.a.a.get(0));
                    }
                }
                if (com.popularapp.periodcalendar.a.a.Q(this))
                {
                    if (!com.popularapp.periodcalendar.a.a.b.f(this))
                    {
                        com.popularapp.periodcalendar.a.a.g(this, false);
                        return;
                    }
                    g.a().e = false;
                    Intent localIntent = new Intent(this, AutoBackupService.class);
                    com.popularapp.periodcalendar.service.a.a().a(this, Integer.valueOf(4), localIntent);
                    return;
                }
            }
        }
        catch (Exception localException)
        {
            localException.printStackTrace();
        }
    }

    private void t()
    {
        this.Y.setText(getString(2131165530));
        this.aa.setText(getString(2131165537));
        this.ac.setText(getString(2131165531));
        this.ae.setText(getString(2131165546));
        this.ag.setText(getString(2131165529));
        if (com.popularapp.periodcalendar.d.a.b(this).equals(""))
        {
            this.an.setText(getString(2131165547));
            return;
        }
        this.ai.setText(getString(2131165857));
    }

    private void u()
    {
        if (!this.g)
        {
            this.g = true;
            r.a().b(this, this.p, "点击log", "", null);
            if (!com.popularapp.periodcalendar.d.a.b(this).equals("")) {
                break label63;
            }
        }
        label63:
        for (Intent localIntent = new Intent(this, LogActivity104.class);; localIntent = new Intent(this, LogActivity.class))
        {
            startActivity(localIntent);
            finish();
            return;
        }
    }

    private void v()
    {
        if (!this.g)
        {
            this.g = true;
            r.a().b(this, this.p, "点击图表", "", null);
            startActivity(new Intent(this, ChartActivity.class));
            finish();
        }
    }

    private void w()
    {
        if (!this.g)
        {
            this.g = true;
            r.a().b(this, this.p, "点击设置", "", null);
            startActivity(new Intent(this, SettingActivity.class));
            finish();
        }
    }

    private void x()
    {
        if (!this.g)
        {
            this.g = true;
            r.a().b(this, this.p, "点击论坛", "", null);
            Intent localIntent = new Intent(this, ForumActivity.class);
            localIntent.putExtra("Type", 6);
            startActivity(localIntent);
            finish();
        }
    }

    private void y()
    {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    private void z()
    {
        startActivity(new Intent(this, AdActivity.class));
        finish();
    }

    public void a()
    {
        this.p = "首页";
    }

    public void i()
    {
        this.J = ((LinearLayout)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624517)));
        this.K = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624519)));
        this.L = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624558)));
        this.M = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624520)));
        this.N = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624521)));
        this.P = findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624523));
        this.R = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624524)));
        this.S = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624525)));
        this.U = ((ImageView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624561)));
        this.T = findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624527));
        this.V = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624528)));
        this.W = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624529)));
        this.Y = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624538)));
        this.aa = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624541)));
        this.ac = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624544)));
        this.ae = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624547)));
        this.ag = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624550)));
        this.al = ((TextView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624532)));
        this.ar = ((ImageView)findViewById(com.popularapp.periodcalendar.d.a.a(this, 2131624511)));
        this.as = ((RelativeLayout)findViewById(2131624510));
        if ((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green")))
        {
            r();
            this.R.setTypeface(q.a().b(com.popularapp.periodcalendar.d.a.c(this)));
            this.V.setTypeface(q.a().b(com.popularapp.periodcalendar.d.a.c(this)));
            this.aq.setText(getString(2131165740).toUpperCase());
            if (com.popularapp.periodcalendar.a.a.c(this.a))
            {
                this.K.setTypeface(q.a().a(com.popularapp.periodcalendar.d.a.c(this)));
                this.M.setTypeface(q.a().c(com.popularapp.periodcalendar.d.a.c(this)));
                this.N.setTypeface(q.a().c(com.popularapp.periodcalendar.d.a.c(this)));
                this.S.setTypeface(q.a().c(com.popularapp.periodcalendar.d.a.c(this)));
                this.W.setTypeface(q.a().c(com.popularapp.periodcalendar.d.a.c(this)));
                this.ap.setTypeface(q.a().c(com.popularapp.periodcalendar.d.a.c(this)));
                this.aq.setTypeface(q.a().c(com.popularapp.periodcalendar.d.a.c(this)));
                this.al.setTypeface(q.a().d(com.popularapp.periodcalendar.d.a.c(this)));
            }
        }
    }

    public void j()
    {
        u.a(this, com.popularapp.periodcalendar.a.a.au(this));
        t();
        this.X.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                MainActivity.a(MainActivity.this, 0, 0L, true);
            }
        });
        this.Z.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                MainActivity.p(MainActivity.this);
            }
        });
        this.ab.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                MainActivity.q(MainActivity.this);
            }
        });
        this.ad.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                MainActivity.r(MainActivity.this);
            }
        });
        this.af.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                MainActivity.a(MainActivity.this, System.currentTimeMillis(), true);
            }
        });
        this.al.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View paramAnonymousView)
            {
                MainActivity.s(MainActivity.this);
            }
        });
        if (com.popularapp.periodcalendar.d.a.b(this).equals(""))
        {
            this.am.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View paramAnonymousView)
                {
                    MainActivity.s(MainActivity.this);
                }
            });
            this.ak.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View paramAnonymousView)
                {
                    MainActivity.s(MainActivity.this);
                }
            });
        }
        if ((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green"))) {
            this.ah.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View paramAnonymousView)
                {
                    MainActivity.t(MainActivity.this);
                }
            });
        }
    }

    public void k()
    {
        g.a().b = false;
        getWindow().setSoftInputMode(3);
        this.au = com.popularapp.periodcalendar.a.a.d;
        if (!this.l)
        {
            Intent localIntent = getIntent();
            this.aD = localIntent.getBooleanExtra("showRate", false);
            if (localIntent.getBooleanExtra("notification", false))
            {
                if (g.a().j != null)
                {
                    g.a().j.finish();
                    g.a().j = null;
                }
                g.a().j = this;
                switch (localIntent.getIntExtra("notification_type", 0))
                {
                    case 1:
                    case 2:
                    case 4:
                    case 64:
                    default:
                        return;
                }
                a(localIntent.getIntExtra("notification_pill_model", 0), localIntent.getLongExtra("notification_date", System.currentTimeMillis()), false);
                return;
            }
            if ((com.popularapp.periodcalendar.a.a.a == null) || (com.popularapp.periodcalendar.a.a.a.size() == 0))
            {
                a(true);
                return;
            }
            m();
            return;
        }
        if ((com.popularapp.periodcalendar.a.a.a == null) || (com.popularapp.periodcalendar.a.a.a.size() == 0))
        {
            a(true);
            return;
        }
        m();
    }

    public void l()
    {
        int j = 0;
        int i = 0;
        Object localObject4;
        int k;
        Object localObject3;
        for (;;)
        {
            try
            {
                this.at = System.currentTimeMillis();
                Object localObject1 = Calendar.getInstance();
                ((Calendar)localObject1).setTimeInMillis(this.at);
                this.at = this.au.a(((Calendar)localObject1).get(1), ((Calendar)localObject1).get(2), ((Calendar)localObject1).get(5));
                this.K.setVisibility(8);
                if (((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green"))) && (com.popularapp.periodcalendar.a.a.c(this.a))) {
                    this.K.setTypeface(q.a().a(com.popularapp.periodcalendar.d.a.c(this)));
                }
                this.M.setVisibility(8);
                this.M.setTextSize(0, com.popularapp.periodcalendar.d.a.f(this, 2131361806));
                this.P.setVisibility(8);
                this.R.setText("");
                this.T.setVisibility(8);
                this.W.setOnClickListener(null);
                this.W.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                localObject1 = (ViewGroup.MarginLayoutParams)this.W.getLayoutParams();
                ((ViewGroup.MarginLayoutParams)localObject1).setMargins((int)(10.0F * getResources().getDisplayMetrics().density), 0, 0, 0);
                this.W.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                this.W.setVisibility(0);
                this.V.setText("");
                if (this.S != null) {
                    this.S.setVisibility(0);
                }
                if ((com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.blue")) || (com.popularapp.periodcalendar.d.a.b(this).equals("com.popularapp.periodcalendar.skin.holo.green")))
                {
                    if (this.O == null) {
                        r();
                    }
                    this.O.setVisibility(8);
                    this.U.setImageDrawable(com.popularapp.periodcalendar.d.a.b(this, 2130837865));
                    this.Q.setGravity(17);
                    this.S.setGravity(17);
                    if ((com.popularapp.periodcalendar.a.a.e(this)) || (!com.popularapp.periodcalendar.a.a.T(this)))
                    {
                        this.ao.setVisibility(8);
                        this.K.setGravity(17);
                        this.M.setGravity(17);
                        if (!com.popularapp.periodcalendar.a.a.q(this)) {
                            break label541;
                        }
                        this.ah.setVisibility(0);
                        this.aj.setVisibility(8);
                    }
                }
                else
                {
                    localObject4 = com.popularapp.periodcalendar.a.a.a();
                    k = ((ArrayList)localObject4).size();
                    if (k <= 0) {
                        break label1527;
                    }
                    if (com.popularapp.periodcalendar.a.a.a == null) {
                        com.popularapp.periodcalendar.a.a.a = this.av.a(this, "uid=" + com.popularapp.periodcalendar.a.a.f(this), "", true);
                    }
                    localObject1 = this.au.b(this, this.at);
                    localObject3 = this.au.c(this, this.at);
                    if (localObject3 != null) {
                        break;
                    }
                    return;
                }
                this.ao.setVisibility(0);
                this.K.setGravity(85);
                this.M.setGravity(85);
                B();
                continue;
                this.ah.setVisibility(8);
            }
            finally {}
            label541:
            this.aj.setVisibility(0);
        }
        long l1;
        int n;
        int m;
        label721:
        Object localObject2;
        if (localPeriodCompat.getMenses_start() > ((PeriodCompat)((ArrayList)localObject4).get(0)).getMenses_start())
        {
            localObject4 = (PeriodCompat)((ArrayList)localObject4).get(0);
            a(this.au.b(((PeriodCompat)localObject4).getMenses_start(), ((PeriodCompat)localObject4).getPeriod_length()));
            this.s = 1;
            if (!localPeriodCompat.isPregnancy())
            {
                if (com.popularapp.periodcalendar.a.a.o(this))
                {
                    l1 = ((PeriodCompat)localObject3).getMenses_start();
                    c(this.au.c(l1));
                }
                k = this.au.c(this, this.av, localPeriodCompat);
                n = Math.abs(k);
                m = localPeriodCompat.getPeriod_length();
                n = m - n;
                if ((localObject3 != null) && (com.popularapp.periodcalendar.a.a.n(this)) && (com.popularapp.periodcalendar.a.a.o(this)))
                {
                    if (m >= 21) {
                        break label1179;
                    }
                    a((PeriodCompat)localObject3);
                }
            }
            if ((!com.popularapp.periodcalendar.a.a.e(this)) || (com.popularapp.periodcalendar.a.a.a.size() <= 0)) {
                break label2089;
            }
            localObject2 = (PeriodCompat)com.popularapp.periodcalendar.a.a.a.get(0);
            this.s = 3;
        }
        switch (com.popularapp.periodcalendar.a.a.P(this))
        {
            case 0:
                for (;;)
                {
                    this.K.setOnClickListener(new View.OnClickListener()
                    {
                        public void onClick(View paramAnonymousView)
                        {
                            MainActivity.b(MainActivity.this, "怀孕文字");
                        }
                    });
                    this.M.setOnClickListener(new View.OnClickListener()
                    {
                        public void onClick(View paramAnonymousView)
                        {
                            MainActivity.b(MainActivity.this, "怀孕文字");
                        }
                    });
                    this.N.setOnClickListener(new View.OnClickListener()
                    {
                        public void onClick(View paramAnonymousView)
                        {
                            MainActivity.b(MainActivity.this, "怀孕文字");
                        }
                    });
                    C();
                    if (!this.av.h(this)) {
                        break;
                    }
                    this.J.setVisibility(0);
                    break;
                    if (((PeriodCompat)localObject2).a(false) >= 0)
                    {
                        l1 = this.au.b(((PeriodCompat)localObject2).getMenses_start(), Math.abs(((PeriodCompat)localObject2).a(true)));
                        l1 = this.au.c(l1);
                        this.s = 1;
                        if (this.at <= l1)
                        {
                            c(this.au.a(this.au.c(((PeriodCompat)localObject2).getMenses_start()), this.at) + 1);
                            this.s = 4;
                        }
                    }
                    long l2;
                    for (;;)
                    {
                        l1 = this.au.c(((PeriodCompat)((ArrayList)localObject4).get(k - 1)).getMenses_start());
                        if (this.at >= l1) {
                            break;
                        }
                        b(l1);
                        break;
                        l2 = ((PeriodCompat)localObject3).getMenses_start();
                        b(this.au.c(l2));
                        if (this.at <= com.popularapp.periodcalendar.a.a.d.b(l1, 2))
                        {
                            this.s = 4;
                            continue;
                            this.s = 2;
                            l1 = this.au.b(((PeriodCompat)localObject2).getMenses_start(), Math.abs(((PeriodCompat)localObject2).a(true)));
                            l1 = this.au.c(l1);
                            m = this.au.a(this.au.c(((PeriodCompat)localObject2).getMenses_start()), this.at) + 1;
                            if ((((PeriodCompat)com.popularapp.periodcalendar.a.a.a.get(0)).getMenses_start() == ((PeriodCompat)localObject2).getMenses_start()) && (this.at <= l1))
                            {
                                c(m);
                            }
                            else
                            {
                                if (((PeriodCompat)localObject2).a(true) + m >= 11) {
                                    this.s = 1;
                                }
                                l1 = ((PeriodCompat)localObject3).getMenses_start();
                                b(this.au.c(l1));
                            }
                        }
                    }
                    if (n >= Math.abs(((PeriodCompat)localObject2).a(true)) + 5 + 1)
                    {
                        l1 = this.au.b(((PeriodCompat)localObject2).getMenses_start(), n - 5);
                        l1 = this.au.c(l1);
                        l2 = this.au.b(((PeriodCompat)localObject2).getMenses_start(), n + 1);
                        l2 = this.au.c(l2);
                        if (this.at < l1)
                        {
                            d(l1);
                            break label721;
                        }
                        if (this.at <= l2)
                        {
                            l1 = this.au.b(((PeriodCompat)localObject2).getMenses_start(), n);
                            l1 = this.au.c(l1);
                            if ((this.at == l1) && (k > 0))
                            {
                                D();
                                break label721;
                            }
                            E();
                            break label721;
                        }
                        a((PeriodCompat)localObject3);
                        break label721;
                    }
                    if (n >= Math.abs(((PeriodCompat)localObject2).a(true)) + 1)
                    {
                        l1 = this.au.b(((PeriodCompat)localObject2).getMenses_start(), n);
                        l1 = this.au.c(l1);
                        l2 = this.au.b(((PeriodCompat)localObject2).getMenses_start(), Math.abs(((PeriodCompat)localObject2).a(true)) + 1);
                        l2 = this.au.c(l2);
                        long l3 = this.au.b(((PeriodCompat)localObject2).getMenses_start(), n + 1);
                        l3 = this.au.c(l3);
                        if (this.at == l1)
                        {
                            D();
                            break label721;
                        }
                        if (this.at < l2)
                        {
                            d(l2);
                            break label721;
                        }
                        if (this.at <= l3)
                        {
                            E();
                            break label721;
                        }
                        a((PeriodCompat)localObject3);
                        break label721;
                    }
                    a((PeriodCompat)localObject3);
                    break label721;
                    this.s = 1;
                    break label721;
                    k = this.au.a(((PeriodCompat)localObject2).getMenses_start(), this.at);
                    m = ((PeriodCompat)localObject2).getPeriod_length();
                    if (k <= m)
                    {
                        if (((PeriodCompat)localObject2).g() <= 1480550400000L) {
                            break label2128;
                        }
                        i = m - k - i;
                        a(String.valueOf(i), getString(u.a(this, i, 2131166066, 2131165535, 2131166067)));
                    }
                    else
                    {
                        if (((PeriodCompat)localObject2).g() <= 1480550400000L) {
                            break label2133;
                        }
                        i = j;
                        i = -(m - k - i);
                        a(String.valueOf(i), getString(u.a(this, i, 2131166062, 2131165533, 2131166063)));
                    }
                }
            case 1:
                label825:
                label1179:
                label1527:
                label1577:
                label1627:
                j = this.au.a(this.au.b(((PeriodCompat)localObject2).getMenses_start(), ((PeriodCompat)localObject2).d()), this.at);
                if (((PeriodCompat)localObject2).g() <= 1480550400000L) {
                    break;
                }
        }
        for (i = 0;; i = 1)
        {
            j = i + j;
            i = j / 7;
            j -= i * 7;
            k = (int)this.K.getTextSize();
            if ((j == 1) && (this.a.getLanguage().toLowerCase().equals("es"))) {}
            for (localObject2 = getString(2131166087, new Object[] { i + " ", " " + j + " " });; localObject2 = getString(2131165548, new Object[] { i + " ", " " + j + " " }))
            {
                localObject3 = new SpannableString((CharSequence)localObject2);
                m = ((String)localObject2).indexOf(i + "");
                n = ((String)localObject2).lastIndexOf(j + "");
                if ((m >= 0) && (n >= 0))
                {
                    ((Spannable)localObject3).setSpan(new AbsoluteSizeSpan(k), 0, ((String)localObject2).length(), 18);
                    ((Spannable)localObject3).setSpan(new AbsoluteSizeSpan(k / 2), (i + "").length() + m, n, 18);
                    ((Spannable)localObject3).setSpan(new AbsoluteSizeSpan(k / 2), (j + "").length() + n, ((String)localObject2).length(), 18);
                }
                a((CharSequence)localObject3);
                break;
            }
            label2089:
            this.K.setOnClickListener(null);
            this.M.setOnClickListener(null);
            this.N.setOnClickListener(null);
            this.N.setVisibility(8);
            break label825;
            break;
            label2128:
            i = 1;
            break label1577;
            label2133:
            i = 1;
            break label1627;
        }
    }

    public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
    {
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
        switch (paramInt1)
        {
        }
        do
        {
            return;
            if (paramInt2 == -1)
            {
                m();
                return;
            }
            a(true);
            return;
            a(true);
            return;
            if (paramInt2 != -1) {
                break;
            }
            if (!this.aE.equals(""))
            {
                b(true);
                com.popularapp.periodcalendar.a.a.e(this, this.aE);
                return;
            }
            com.popularapp.periodcalendar.a.a.e(this, "");
            paramIntent = com.popularapp.periodcalendar.utils.b.b(this);
        } while ((paramIntent == null) || (paramIntent.length <= 0));
        a(paramIntent, null);
        return;
        com.popularapp.periodcalendar.a.a.e(this, "");
        c(false);
    }

    public void onCreate(Bundle paramBundle)
    {
        try
        {
            super.onCreate(paramBundle);
            a(45);
            if (this.ay) {}
        }
        catch (IllegalStateException paramBundle)
        {
            try
            {
                setContentView(com.popularapp.periodcalendar.d.a.g(this, 2130903155));
                o();
                this.av = com.popularapp.periodcalendar.a.a.b;
                a(47);
                if (!this.l)
                {
                    paramBundle = getIntent();
                    if ((paramBundle != null) && ((paramBundle.getAction() + "").equals("android.intent.action.VIEW")))
                    {
                        paramBundle = paramBundle.getData();
                        new com.popularapp.periodcalendar.dialog.w().a(this, paramBundle, this.aQ);
                        this.aC = true;
                    }
                }
                a(50);
                if (!this.ay)
                {
                    i();
                    a(55);
                    j();
                    a(60);
                    if (!this.aC) {
                        k();
                    }
                    a(65);
                }
                if (j.a().b(this)) {
                    this.f = true;
                }
                com.popularapp.periodcalendar.c.c.d().c(this, "Main Page        ");
                return;
                paramBundle = paramBundle;
                paramBundle.printStackTrace();
                r.a().a(this, "MainActivity", 9, paramBundle, "");
                this.ay = true;
                new t(this).a("首页layout加载");
            }
            catch (Exception paramBundle)
            {
                for (;;)
                {
                    r.a().a(this, "MainActivity", 10, paramBundle, "");
                    paramBundle.printStackTrace();
                    this.ay = true;
                    new t(this).a("首页layout加载");
                }
            }
        }
    }

    public void onDestroy()
    {
        this.x = true;
        super.onDestroy();
    }

    public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
    {
        if (paramInt == 4)
        {
            P();
            return true;
        }
        return super.onKeyDown(paramInt, paramKeyEvent);
    }

    public void onPause()
    {
        try
        {
            if (this.aA)
            {
                this.aA = false;
                if ((this.ax != null) && (this.ax.isShowing())) {
                    this.ax.dismiss();
                }
            }
            if ((this.aw != null) && (this.aw.isShowing())) {
                this.aw.dismiss();
            }
        }
        catch (Exception localException)
        {
            for (;;)
            {
                r.a().a(this, "MainActivity", 12, localException, "");
                localException.printStackTrace();
            }
        }
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        if ((this.ay) || (this.aC) || (this.aB)) {}
        label143:
        do
        {
            for (;;)
            {
                try
                {
                    l();
                    q();
                    a(60);
                    h();
                    if ((com.popularapp.periodcalendar.a.a.ab(this)) || (this.aC)) {
                        break label143;
                    }
                    if ((this.ar == null) || (!j.a().b(this))) {
                        break;
                    }
                    j.a().c(this);
                    this.e = true;
                    p();
                    return;
                }
                catch (Exception localException)
                {
                    r.a().a(this, "MainActivity", 11, localException, "");
                    localException.printStackTrace();
                    continue;
                }
                this.aB = true;
            }
            if (this.as != null) {
                this.as.setVisibility(8);
            }
            c();
            return;
        } while (this.as == null);
        this.as.setVisibility(8);
    }

    public void onStart()
    {
        super.onStart();
        try
        {
            if (getIntent().getBooleanExtra("open_app", false))
            {
                r.a();
                r.a().c(this);
            }
            return;
        }
        catch (Exception localException)
        {
            localException.printStackTrace();
        }
    }
}
