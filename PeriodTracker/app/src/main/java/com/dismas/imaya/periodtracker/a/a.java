package com.dismas.imaya.periodtracker.a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by imaya on 1/30/17.
 */

public class a
{
    public static ArrayList<PeriodCompat> a = new ArrayList();
    public static f b = new f();
    public static e c = new e();
    public static b d = new b();

    public static int A(Context paramContext)
    {
        return a(paramContext).getInt("notification_model", 65);
    }

    public static void A(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("has_view_help", paramInt).commit();
    }

    public static String B(Context paramContext)
    {
        return a(paramContext).getString("period_reminder_json", "");
    }

    public static void B(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("has_view_video_help", paramInt).commit();
    }

    public static String C(Context paramContext)
    {
        return a(paramContext).getString("fertility_reminder_json", "");
    }

    public static void C(Context paramContext, int paramInt) {}

    public static String D(Context paramContext)
    {
        return a(paramContext).getString("ovulation_reminder_json", "");
    }

    public static void D(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("backup_type_count", paramInt).commit();
    }

    public static String E(Context paramContext)
    {
        return a(paramContext).getString("period_input_reminder_json", "");
    }

    public static void E(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("use_count", paramInt).commit();
    }

    public static long F(Context paramContext)
    {
        return a(paramContext).getLong("last_backup_time", -1L);
    }

    public static void F(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("forecast_period_127", paramInt).commit();
    }

    public static void G(Context paramContext)
    {
        a(paramContext).edit().putLong("last_backup_time", System.currentTimeMillis()).commit();
    }

    public static void G(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("forecast_model_127", paramInt).commit();
    }

    public static int H(Context paramContext)
    {
        return 1;
    }

    public static void H(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("forecast_ovulation", paramInt).commit();
    }

    public static int I(Context paramContext)
    {
        return 1;
    }

    public static void I(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("lastversionCode", paramInt).commit();
    }

    public static int J(Context paramContext)
    {
        return 1;
    }

    public static void J(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("language", paramInt).commit();
    }

    public static int K(Context paramContext)
    {
        return 1;
    }

    public static void K(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("insert_pill_injection_num", paramInt).commit();
    }

    public static int L(Context paramContext)
    {
        return b(paramContext).getInt("update_version", 0);
    }

    public static void L(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("insert_pill_vring_num", paramInt).commit();
    }

    public static int M(Context paramContext)
    {
        return b(paramContext).getInt("update_later_count", 0);
    }

    public static void M(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("insert_pill_patch_num", paramInt).commit();
    }

    public static int N(Context paramContext)
    {
        int i = a(paramContext).getInt("menses_length", 3);
        if (i > 99)
        {
            r(paramContext, 4);
            return 3;
        }
        return i;
    }

    public static void N(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("insert_pill_birth_num", paramInt).commit();
    }

    public static int O(Context paramContext)
    {
        int i = a(paramContext).getInt("ovulation_days", 14);
        if (i > 99)
        {
            u(paramContext, 14);
            return 14;
        }
        return i;
    }

    public static void O(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("forum_index", paramInt).commit();
    }

    public static int P(Context paramContext)
    {
        return a(paramContext).getInt("pregnant_type", 1);
    }

    public static void P(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("pwd_cache_type", paramInt).commit();
    }

    public static void Q(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("calendar_length_set_step", paramInt).commit();
    }

    public static boolean Q(Context paramContext)
    {
        return a(paramContext).getBoolean("need_start_auto_backup", false);
    }

    public static void R(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("last_view_chart_position", paramInt).commit();
    }

    public static boolean R(Context paramContext)
    {
        return a(paramContext).getBoolean("need_auto_backup", false);
    }

    public static void S(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("org_type", paramInt).commit();
    }

    public static boolean S(Context paramContext)
    {
        return a(paramContext).getBoolean("show_age_ad", true);
    }

    public static boolean T(Context paramContext)
    {
        return a(paramContext).getBoolean("show_pregnancy_chance", true);
    }

    public static int U(Context paramContext)
    {
        return 1;
    }

    public static int V(Context paramContext)
    {
        return 1;
    }

    public static String W(Context paramContext)
    {
        return b(paramContext).getString("google_drive_account_name", "");
    }

    public static int X(Context paramContext)
    {
        return b(paramContext).getInt("generation", 0);
    }

    public static String Y(Context paramContext)
    {
        return b(paramContext).getString("temp_backup_file_path", "");
    }

    public static boolean Z(Context paramContext)
    {
        return b(paramContext).getBoolean("debug_mode", false);
    }

    public static float a(Activity paramActivity)
    {
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
        return localDisplayMetrics.density;
    }

    public static SharedPreferences a(Context paramContext)
    {
        try
        {
            SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("PC", 0);
            return localSharedPreferences;
        }
        catch (NullPointerException localNullPointerException)
        {
            r.a().a(paramContext, "DataPool", 0, localNullPointerException, "");
            localNullPointerException.printStackTrace();
        }
        return paramContext.getSharedPreferences("PC", 0);
    }

    /* Error */
    public static ArrayList<PeriodCompat> a()
    {
        // Byte code:
        //   0: ldc 2
        //   2: monitorenter
        //   3: new 17	java/util/ArrayList
        //   6: dup
        //   7: invokespecial 20	java/util/ArrayList:<init>	()V
        //   10: astore_2
        //   11: iconst_0
        //   12: istore_0
        //   13: iload_0
        //   14: getstatic 22	com/popularapp/periodcalendar/a/a:a	Ljava/util/ArrayList;
        //   17: invokevirtual 254	java/util/ArrayList:size	()I
        //   20: if_icmpge +21 -> 41
        //   23: getstatic 22	com/popularapp/periodcalendar/a/a:a	Ljava/util/ArrayList;
        //   26: iload_0
        //   27: invokevirtual 258	java/util/ArrayList:get	(I)Ljava/lang/Object;
        //   30: checkcast 260	com/popularapp/periodcalendar/model_compat/PeriodCompat
        //   33: invokevirtual 263	com/popularapp/periodcalendar/model_compat/PeriodCompat:isPregnancy	()Z
        //   36: istore_1
        //   37: iload_1
        //   38: ifeq +8 -> 46
        //   41: ldc 2
        //   43: monitorexit
        //   44: aload_2
        //   45: areturn
        //   46: aload_2
        //   47: getstatic 22	com/popularapp/periodcalendar/a/a:a	Ljava/util/ArrayList;
        //   50: iload_0
        //   51: invokevirtual 258	java/util/ArrayList:get	(I)Ljava/lang/Object;
        //   54: invokevirtual 267	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   57: pop
        //   58: iload_0
        //   59: iconst_1
        //   60: iadd
        //   61: istore_0
        //   62: goto -49 -> 13
        //   65: astore_2
        //   66: ldc 2
        //   68: monitorexit
        //   69: aload_2
        //   70: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   12	50	0	i	int
        //   36	2	1	bool	boolean
        //   10	37	2	localArrayList	ArrayList
        //   65	5	2	localObject	Object
        // Exception table:
        //   from	to	target	type
        //   3	11	65	finally
        //   13	37	65	finally
        //   46	58	65	finally
    }

    public static void a(Context paramContext, float paramFloat)
    {
        a(paramContext).edit().putFloat("last_input_height", paramFloat).commit();
    }

    public static void a(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("uid", paramInt).commit();
    }

    public static void a(Context paramContext, long paramLong)
    {
        a(paramContext).edit().putLong("last_period_modify_time", paramLong).commit();
    }

    public static void a(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("period_reminder_json", paramString).commit();
    }

    public static void a(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("is_pregnant", paramBoolean).commit();
    }

    public static boolean a(Locale paramLocale)
    {
        boolean bool = false;
        paramLocale = paramLocale.getLanguage().toLowerCase();
        if ((paramLocale.equals("mk")) || (paramLocale.equals("sr")) || (paramLocale.equals("cs")) || (paramLocale.equals("my")) || (paramLocale.equals("en")) || (paramLocale.equals("ru")) || (paramLocale.equals("zh")) || (paramLocale.equals("es")) || (paramLocale.equals("ko")) || (paramLocale.equals("pt")) || (paramLocale.equals("da")) || (paramLocale.equals("de")) || (paramLocale.equals("fr")) || (paramLocale.equals("hi")) || (paramLocale.equals("it")) || (paramLocale.equals("pl")) || (paramLocale.equals("cs")) || (paramLocale.equals("sv")) || (paramLocale.equals("fi")) || (paramLocale.equals("ja"))) {
            bool = true;
        }
        return bool;
    }

    public static String aA(Context paramContext)
    {
        return a(paramContext).getString("snooze_table_json", "");
    }

    public static String aB(Context paramContext)
    {
        return b(paramContext).getString("crash_pkg_name", "");
    }

    public static long aC(Context paramContext)
    {
        return b(paramContext).getLong("last_click_notification_time", 0L);
    }

    public static void aD(Context paramContext)
    {
        b(paramContext).edit().putLong("last_click_notification_time", System.currentTimeMillis()).commit();
    }

    public static boolean aE(Context paramContext)
    {
        return b(paramContext).getBoolean("show_forum_panguage_option", true);
    }

    public static int aF(Context paramContext)
    {
        return b(paramContext).getInt("forum_index", 0);
    }

    public static String aG(Context paramContext)
    {
        return b(paramContext).getString("select_folder", "");
    }

    public static String aH(Context paramContext)
    {
        return b(paramContext).getString("bbs1_result", "");
    }

    public static String aI(Context paramContext)
    {
        return a(paramContext).getString("mood_usage_list", ",");
    }

    public static long aJ(Context paramContext)
    {
        return b(paramContext).getLong("last_network_time", 0L);
    }

    public static void aK(Context paramContext)
    {
        b(paramContext).edit().putLong("last_network_time", System.currentTimeMillis()).commit();
    }

    public static long aL(Context paramContext)
    {
        return b(paramContext).getLong("last_open_time", 0L);
    }

    public static void aM(Context paramContext)
    {
        b(paramContext).edit().putLong("last_open_time", System.currentTimeMillis()).commit();
    }

    public static long aN(Context paramContext)
    {
        try
        {
            long l = a(paramContext).getLong("last_period_modify_time", 0L);
            return l;
        }
        catch (ClassCastException localClassCastException)
        {
            a(paramContext).edit().remove("last_period_modify_time").commit();
            localClassCastException.printStackTrace();
        }
        return 0L;
    }

    public static long aO(Context paramContext)
    {
        try
        {
            long l = a(paramContext).getLong("last_menses_modify_time", 0L);
            return l;
        }
        catch (ClassCastException localClassCastException)
        {
            a(paramContext).edit().remove("last_menses_modify_time").commit();
            localClassCastException.printStackTrace();
        }
        return 0L;
    }

    public static String aP(Context paramContext)
    {
        return a(paramContext).getString("pwd_cache", "");
    }

    public static int aQ(Context paramContext)
    {
        return a(paramContext).getInt("pwd_cache_type", 0);
    }

    public static boolean aR(Context paramContext)
    {
        return a(paramContext).getBoolean("has_view_calendar", false);
    }

    public static boolean aS(Context paramContext)
    {
        return a(paramContext).getBoolean("has_set_cycle", false);
    }

    public static int aT(Context paramContext)
    {
        return a(paramContext).getInt("calendar_length_set_step", -1);
    }

    public static String aU(Context paramContext)
    {
        return a(paramContext).getString("take_pill_today", "");
    }

    public static String aV(Context paramContext)
    {
        return a(paramContext).getString("recent_mood_list", ",");
    }

    public static String aW(Context paramContext)
    {
        return a(paramContext).getString("recent_symp_list", ",");
    }

    public static boolean aX(Context paramContext)
    {
        return a(paramContext).getBoolean("show_edit_period_tip", true);
    }

    public static int aY(Context paramContext)
    {
        return b(paramContext).getInt("last_view_chart_position", 0);
    }

    public static boolean aZ(Context paramContext)
    {
        return b(paramContext).getBoolean("period_edit_has_saved", false);
    }

    public static boolean aa(Context paramContext)
    {
        return a(paramContext).getBoolean("show_bmi", true);
    }

    public static boolean ab(Context paramContext)
    {
        return b(paramContext).getBoolean("is_new_user", true);
    }

    public static int ac(Context paramContext)
    {
        return 1;
    }

    public static int ad(Context paramContext)
    {
        return 1;
    }

    public static int ae(Context paramContext)
    {
        return b(paramContext).getInt("has_view_video_help", 0);
    }

    public static int af(Context paramContext)
    {
        return 1;
    }

    public static int ag(Context paramContext)
    {
        return b(paramContext).getInt("backup_type_count", 0);
    }

    public static int ah(Context paramContext)
    {
        return b(paramContext).getInt("use_count", 0);
    }

    public static int ai(Context paramContext)
    {
        if (a(paramContext).getInt("forecast_period", -1) == 4)
        {
            a(paramContext).edit().remove("forecast_period").commit();
            F(paramContext, 4);
        }
        return a(paramContext).getInt("forecast_period_127", 1);
    }

    public static int aj(Context paramContext)
    {
        if (a(paramContext).getInt("forecast_model", -1) == 4)
        {
            a(paramContext).edit().remove("forecast_model").commit();
            G(paramContext, 4);
        }
        return a(paramContext).getInt("forecast_model_127", 1);
    }

    public static int ak(Context paramContext)
    {
        int j = a(paramContext).getInt("forecast_ovulation", 1);
        int i;
        if (j != 3)
        {
            i = j;
            if (j != 2) {}
        }
        else
        {
            i = 1;
        }
        return i;
    }

    public static String al(Context paramContext)
    {
        return a(paramContext).getString("symp_hiden_list", ",");
    }

    public static String am(Context paramContext)
    {
        return a(paramContext).getString("symp_rename_list", "");
    }

    public static String an(Context paramContext)
    {
        return a(paramContext).getString("symp_retype_list", "");
    }

    public static String ao(Context paramContext)
    {
        return a(paramContext).getString("mood_hiden_list", ",");
    }

    public static String ap(Context paramContext)
    {
        return a(paramContext).getString("mood_rename_list", "");
    }

    public static String aq(Context paramContext)
    {
        return b(paramContext).getString("versionCode", "");
    }

    public static boolean ar(Context paramContext)
    {
        try
        {
            if (149 != b(paramContext).getInt("lastversionCode", 0))
            {
                I(paramContext, 149);
                return true;
            }
        }
        catch (Exception localException)
        {
            r.a().a(paramContext, "DataPool", 3, localException, "");
            localException.printStackTrace();
        }
        return false;
    }

    public static String as(Context paramContext)
    {
        return b(paramContext).getString("generationChangeInfo", "");
    }

    public static float at(Context paramContext)
    {
        return a(paramContext).getFloat("last_input_temp", 37.0F);
    }

    public static int au(Context paramContext)
    {
        return a(paramContext).getInt("language", -1);
    }

    public static String av(Context paramContext)
    {
        return a(paramContext).getString("pill_list", "");
    }

    public static int aw(Context paramContext)
    {
        return a(paramContext).getInt("insert_pill_injection_num", 0);
    }

    public static int ax(Context paramContext)
    {
        return a(paramContext).getInt("insert_pill_vring_num", 0);
    }

    public static int ay(Context paramContext)
    {
        return a(paramContext).getInt("insert_pill_patch_num", 0);
    }

    public static int az(Context paramContext)
    {
        return a(paramContext).getInt("insert_pill_birth_num", 0);
    }

    public static SharedPreferences b(Context paramContext)
    {
        try
        {
            SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("Global", 0);
            return localSharedPreferences;
        }
        catch (NullPointerException localNullPointerException)
        {
            r.a().a(paramContext, "DataPool", 1, localNullPointerException, "");
            localNullPointerException.printStackTrace();
        }
        return paramContext.getSharedPreferences("Global", 0);
    }

    public static String b()
    {
        int k = a.size();
        if (k <= 1) {
            return "/";
        }
        double d1 = 0.0D;
        int i = 1;
        int j = 0;
        for (;;)
        {
            if ((i >= k) || (((PeriodCompat)a.get(i)).isPregnancy()))
            {
                if (j > 0) {
                    break;
                }
                return "/";
            }
            d1 += ((PeriodCompat)a.get(i)).getPeriod_length();
            j += 1;
            i += 1;
        }
        return String.valueOf(new BigDecimal(d1 / j).setScale(0, 4));
    }

    public static void b(Context paramContext, float paramFloat)
    {
        a(paramContext).edit().putFloat("last_input_weight", paramFloat).commit();
    }

    public static void b(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("height_unit", paramInt).commit();
    }

    public static void b(Context paramContext, long paramLong)
    {
        a(paramContext).edit().putLong("last_menses_modify_time", paramLong).commit();
    }

    public static void b(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("fertility_reminder_json", paramString).commit();
    }

    public static void b(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("show_ovulation", paramBoolean).commit();
    }

    public static boolean b(Locale paramLocale)
    {
        boolean bool = false;
        if (paramLocale.getLanguage().toLowerCase().equals("my")) {
            bool = true;
        }
        return bool;
    }

    public static int ba(Context paramContext)
    {
        return a(paramContext).getInt("org_type", 1);
    }

    public static String bb(Context paramContext)
    {
        return b(paramContext).getString("notification_list", "");
    }

    public static boolean bc(Context paramContext)
    {
        return b(paramContext).getBoolean("job_crash", false);
    }

    public static boolean bd(Context paramContext)
    {
        return b(paramContext).getBoolean("local_enable_job", false);
    }

    public static boolean be(Context paramContext)
    {
        return b(paramContext).getBoolean("enable_app_wall", false);
    }

    public static long bf(Context paramContext)
    {
        return b(paramContext).getLong("last_time_check_time", 0L);
    }

    public static void bg(Context paramContext)
    {
        b(paramContext).edit().putLong("last_time_check_time", System.currentTimeMillis()).commit();
    }

    private static boolean bh(Context paramContext)
    {
        return a(paramContext).getBoolean("ignore_long_cycle", true);
    }

    private static boolean bi(Context paramContext)
    {
        return a(paramContext).getBoolean("ignore_short_cycle", true);
    }

    public static String c()
    {
        int m = a.size();
        if (m <= 0) {
            return "/";
        }
        double d1 = 0.0D;
        if ((((PeriodCompat)a.get(0)).a(false) >= 0) && (!((PeriodCompat)a.get(0)).isPregnancy()))
        {
            d1 = Math.abs(((PeriodCompat)a.get(0)).a(true));
            if (m == 1) {
                return String.valueOf(new BigDecimal(d1 + 1.0D).setScale(0, 4));
            }
        }
        label200:
        for (int i = 1;; i = 0)
        {
            int k = 1;
            int j = i;
            i = k;
            for (;;)
            {
                if ((i >= m) || (((PeriodCompat)a.get(i)).isPregnancy()))
                {
                    if (j > 0) {
                        break;
                    }
                    return "/";
                    if (m != 1) {
                        break label200;
                    }
                    return "/";
                }
                d1 += Math.abs(((PeriodCompat)a.get(i)).a(true));
                j += 1;
                i += 1;
            }
            return String.valueOf(new BigDecimal(d1 / j + 1.0D).setScale(0, 4));
        }
    }

    public static String c(Context paramContext)
    {
        int k = a.size();
        if (k <= 1) {
            return "/";
        }
        if (aj(paramContext) == 4)
        {
            double d1 = 0.0D;
            int i = 1;
            int j = 0;
            for (;;)
            {
                if ((i >= k) || (((PeriodCompat)a.get(i)).isPregnancy()))
                {
                    if (j > 0) {
                        break;
                    }
                    return "/";
                }
                d1 += ((PeriodCompat)a.get(i)).getPeriod_length();
                j += 1;
                i += 1;
            }
            return String.valueOf(new BigDecimal(d1 / j).setScale(0, 4));
        }
        return String.valueOf(d.b(paramContext, new PeriodCompat()));
    }

    public static void c(Context paramContext, float paramFloat)
    {
        a(paramContext).edit().putFloat("last_input_temp", paramFloat).commit();
    }

    public static void c(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("weight_unit", paramInt).commit();
    }

    public static void c(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("ovulation_reminder_json", paramString).commit();
    }

    public static void c(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("show_predict_period", paramBoolean).commit();
    }

    public static boolean c(Locale paramLocale)
    {
        boolean bool2 = false;
        paramLocale = paramLocale.getLanguage().toLowerCase();
        boolean bool1 = bool2;
        if (!paramLocale.equals("el"))
        {
            bool1 = bool2;
            if (!paramLocale.equals("uk"))
            {
                bool1 = bool2;
                if (!paramLocale.equals("sr"))
                {
                    bool1 = bool2;
                    if (!paramLocale.equals("pl"))
                    {
                        bool1 = bool2;
                        if (!paramLocale.equals("ro"))
                        {
                            bool1 = bool2;
                            if (!paramLocale.equals("vi"))
                            {
                                bool1 = bool2;
                                if (!paramLocale.equals("hr"))
                                {
                                    bool1 = bool2;
                                    if (!paramLocale.equals("cs"))
                                    {
                                        bool1 = bool2;
                                        if (!paramLocale.endsWith("mk")) {
                                            bool1 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return bool1;
    }

    public static void d(Context paramContext)
    {
        try
        {
            if (((a == null) || (a.size() == 0)) && (f(paramContext) != -1))
            {
                a = b.a(paramContext, "uid=" + f(paramContext), "", true);
                b.a(paramContext, a);
            }
            return;
        }
        finally {}
    }

    public static void d(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("temperature_unit", paramInt).commit();
    }

    public static void d(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("period_input_reminder_json", paramString).commit();
    }

    public static void d(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("intercourse_option", paramBoolean).commit();
    }

    public static boolean d(Locale paramLocale)
    {
        boolean bool = false;
        paramLocale = paramLocale.getLanguage().toLowerCase();
        if ((paramLocale.equals("ar")) || (paramLocale.equals("iw")) || (paramLocale.equals("fa")) || (paramLocale.equals("ur"))) {
            bool = true;
        }
        return bool;
    }

    public static void e(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("first_day_of_week", paramInt).commit();
    }

    public static void e(Context paramContext, String paramString)
    {
        b(paramContext).edit().putString("google_drive_account_name", paramString).commit();
    }

    public static void e(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("show_forum", paramBoolean).commit();
    }

    public static boolean e(Context paramContext)
    {
        return a(paramContext).getBoolean("is_pregnant", false);
    }

    public static boolean e(Locale paramLocale)
    {
        boolean bool = false;
        paramLocale = paramLocale.getLanguage().toLowerCase();
        if ((paramLocale.equals("en")) || (paramLocale.equals("zh")) || (paramLocale.equals("ko")) || (paramLocale.equals("ru"))) {
            bool = true;
        }
        return bool;
    }

    public static int f(Context paramContext)
    {
        return a(paramContext).getInt("uid", 0);
    }

    public static void f(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("date_format", paramInt).commit();
    }

    public static void f(Context paramContext, String paramString)
    {
        b(paramContext).edit().putString("temp_backup_file_path", paramString).commit();
    }

    public static void f(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("ContraceptiveMedicine", paramBoolean).commit();
    }

    public static int g(Context paramContext)
    {
        return a(paramContext).getInt("height_unit", 0);
    }

    public static void g(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("ignore_irregular_cycle", paramInt).commit();
    }

    public static void g(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("symp_hiden_list", paramString).commit();
    }

    public static void g(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("need_start_auto_backup", paramBoolean).commit();
    }

    public static float h(Context paramContext)
    {
        return a(paramContext).getFloat("last_input_height", 0.0F);
    }

    public static void h(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("condom_option", paramInt).commit();
    }

    public static void h(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("symp_rename_list", paramString).commit();
    }

    public static void h(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("need_auto_backup", paramBoolean).commit();
    }

    public static int i(Context paramContext)
    {
        return a(paramContext).getInt("weight_unit", 0);
    }

    public static void i(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("notification_model", paramInt).commit();
    }

    public static void i(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("symp_retype_list", paramString).commit();
    }

    public static void i(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("show_age_ad", paramBoolean).commit();
    }

    public static float j(Context paramContext)
    {
        return a(paramContext).getFloat("last_input_weight", 0.0F);
    }

    public static int j(Context paramContext, int paramInt)
    {
        return a(paramContext).getInt("backup_type", paramInt);
    }

    public static void j(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("mood_hiden_list", paramString).commit();
    }

    public static void j(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("show_pregnancy_chance", paramBoolean).commit();
    }

    public static int k(Context paramContext)
    {
        return a(paramContext).getInt("temperature_unit", 0);
    }

    public static void k(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("backup_type", paramInt).commit();
    }

    public static void k(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("mood_rename_list", paramString).commit();
    }

    public static void k(Context paramContext, boolean paramBoolean)
    {
        b(paramContext).edit().putBoolean("debug_mode", paramBoolean).commit();
    }

    public static int l(Context paramContext)
    {
        return a(paramContext).getInt("first_day_of_week", 0);
    }

    public static void l(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("has_view_notification", paramInt).commit();
    }

    public static void l(Context paramContext, String paramString)
    {
        b(paramContext).edit().putString("versionCode", paramString).commit();
    }

    public static void l(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("show_bmi", paramBoolean).commit();
    }

    public static int m(Context paramContext)
    {
        return a(paramContext).getInt("date_format", 9);
    }

    public static void m(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("has_view_pregnancy", paramInt).commit();
    }

    public static void m(Context paramContext, String paramString)
    {
        b(paramContext).edit().putString("generationChangeInfo", paramString).commit();
    }

    public static void m(Context paramContext, boolean paramBoolean)
    {
        b(paramContext).edit().putBoolean("is_new_user", paramBoolean).commit();
    }

    public static void n(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("has_view_CN_forum", paramInt).commit();
    }

    public static void n(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("pill_list", paramString).commit();
    }

    public static void n(Context paramContext, boolean paramBoolean)
    {
        b(paramContext).edit().putBoolean("show_forum_panguage_option", paramBoolean).commit();
    }

    public static boolean n(Context paramContext)
    {
        return a(paramContext).getBoolean("show_ovulation", true);
    }

    public static void o(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("has_view_TW_forum", paramInt).commit();
    }

    public static void o(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("snooze_table_json", paramString).commit();
    }

    public static void o(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("has_view_calendar", paramBoolean).commit();
    }

    public static boolean o(Context paramContext)
    {
        return a(paramContext).getBoolean("show_predict_period", true);
    }

    public static void p(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("update_version", paramInt).commit();
    }

    public static void p(Context paramContext, String paramString)
    {
        b(paramContext).edit().putString("crash_pkg_name", paramString).commit();
    }

    public static void p(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("has_set_cycle", paramBoolean).commit();
    }

    public static boolean p(Context paramContext)
    {
        return a(paramContext).getBoolean("intercourse_option", true);
    }

    public static void q(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("update_later_count", paramInt).commit();
    }

    public static void q(Context paramContext, String paramString)
    {
        b(paramContext).edit().putString("select_folder", paramString).commit();
        p.f(paramContext, paramString);
    }

    public static void q(Context paramContext, boolean paramBoolean)
    {
        a(paramContext).edit().putBoolean("show_edit_period_tip", paramBoolean).commit();
    }

    public static boolean q(Context paramContext)
    {
        return a(paramContext).getBoolean("show_forum", true);
    }

    public static void r(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("menses_length", paramInt - 1).commit();
    }

    public static void r(Context paramContext, String paramString)
    {
        b(paramContext).edit().putString("bbs1_result", paramString).commit();
    }

    public static void r(Context paramContext, boolean paramBoolean)
    {
        b(paramContext).edit().putBoolean("period_edit_has_saved", paramBoolean).commit();
    }

    public static boolean r(Context paramContext)
    {
        return a(paramContext).getBoolean("ContraceptiveMedicine", true);
    }

    public static int s(Context paramContext, int paramInt)
    {
        return a(paramContext).getInt("period_length", paramInt);
    }

    public static void s(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("mood_usage_list", paramString).commit();
    }

    public static void s(Context paramContext, boolean paramBoolean)
    {
        b(paramContext).edit().putBoolean("job_crash", paramBoolean).commit();
    }

    public static boolean s(Context paramContext)
    {
        int i = a(paramContext).getInt("ignore_irregular_cycle", -1);
        if ((i == -1) && ((bh(paramContext)) || (bi(paramContext)))) {
            g(paramContext, 1);
        }
        while (i == 1) {
            return true;
        }
        return false;
    }

    public static void t(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("period_length", paramInt).commit();
    }

    public static void t(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("pwd_cache", paramString).commit();
    }

    public static void t(Context paramContext, boolean paramBoolean)
    {
        b(paramContext).edit().putBoolean("enable_app_wall", paramBoolean).commit();
    }

    public static boolean t(Context paramContext)
    {
        boolean bool = false;
        try
        {
            int i = a(paramContext).getInt("condom_option", 0);
            if (i != 2) {
                bool = true;
            }
            return bool;
        }
        catch (Exception localException)
        {
            r.a().a(paramContext, "DataPool", 2, localException, "");
            localException.printStackTrace();
            a(paramContext).edit().remove("condom_option").commit();
        }
        return true;
    }

    public static void u(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("ovulation_days", paramInt).commit();
    }

    public static void u(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("take_pill_today", paramString).commit();
    }

    public static boolean u(Context paramContext)
    {
        return a(paramContext).getBoolean("org_option", true);
    }

    public static void v(Context paramContext, int paramInt)
    {
        a(paramContext).edit().putInt("pregnant_type", paramInt).commit();
    }

    public static void v(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("recent_mood_list", paramString).commit();
    }

    public static boolean v(Context paramContext)
    {
        return a(paramContext).getBoolean("org_report_option", true);
    }

    public static void w(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("has_view_time_line", paramInt).commit();
    }

    public static void w(Context paramContext, String paramString)
    {
        a(paramContext).edit().putString("recent_symp_list", paramString).commit();
    }

    public static boolean w(Context paramContext)
    {
        return a(paramContext).getBoolean("bbs1_option", true);
    }

    public static void x(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("has_view_gift", paramInt).commit();
    }

    public static void x(Context paramContext, String paramString)
    {
        b(paramContext).edit().putString("notification_list", paramString).commit();
    }

    public static boolean x(Context paramContext)
    {
        return a(paramContext).getBoolean("freq_option", true);
    }

    public static void y(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("generation", paramInt).commit();
    }

    public static boolean y(Context paramContext)
    {
        return a(paramContext).getBoolean("sex_times_option", true);
    }

    public static void z(Context paramContext, int paramInt)
    {
        b(paramContext).edit().putInt("has_view_gd", paramInt).commit();
    }

    public static boolean z(Context paramContext)
    {
        return a(paramContext).getBoolean("chart_option", true);
    }
}