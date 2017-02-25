package com.dismas.imaya.periodtracker.a;

import android.content.Context;
import android.text.format.DateFormat;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * Created by imaya on 1/30/17.
 */

public class b
{
    private double a(int paramInt, Context paramContext)
    {
        switch (a.l(paramContext))
        {
            default:
                return 0.0D;
            case 0:
                return Double.valueOf(paramInt).doubleValue();
            case 1:
                if (paramInt == 1) {
                    return Double.valueOf(7.0D).doubleValue();
                }
                return Double.valueOf(paramInt - 1).doubleValue();
        }
        if (paramInt == 7) {
            return Double.valueOf(1.0D).doubleValue();
        }
        return Double.valueOf(paramInt + 1).doubleValue();
    }

    private int a(Context paramContext, f paramf, ArrayList<PeriodCompat> paramArrayList)
    {
        int m;
        int i;
        PeriodCompat localPeriodCompat1;
        label96:
        int i2;
        int i4;
        int n;
        Object localObject;
        float f2;
        long l1;
        long l2;
        int k;
        long l3;
        int j;
        int i3;
        label286:
        try
        {
            m = a.O(paramContext);
            i = paramArrayList.size();
            if (i <= 0)
            {
                i = m;
                return i;
            }
            localPeriodCompat1 = (PeriodCompat)paramArrayList.get(paramArrayList.size() - 1);
            PeriodCompat localPeriodCompat2 = (PeriodCompat)paramArrayList.get(0);
            paramf = paramf.b(paramContext, localPeriodCompat1.getMenses_start(), b(localPeriodCompat2.getMenses_start(), localPeriodCompat2.getPeriod_length()) - 86400000L);
            if (paramf == null) {
                break label573;
            }
            if (paramf.size() > 0) {
                break label580;
            }
        }
        finally {}
        if (i2 < paramArrayList.size())
        {
            localPeriodCompat1 = (PeriodCompat)paramArrayList.get(i2);
            i4 = localPeriodCompat1.getPeriod_length();
            if (i4 < 21)
            {
                i = n;
                f2 = localObject;
                break label592;
            }
            l1 = localPeriodCompat1.getMenses_start();
            l2 = b(l1, localPeriodCompat1.getPeriod_length());
            k = Integer.MAX_VALUE;
            l3 = b(l1, localPeriodCompat1.getPeriod_length() - m);
            i = -1;
            j = 0;
        }
        for (int i1 = 0;; i1 = i3)
        {
            long l4;
            if (i1 < paramf.size())
            {
                l4 = ((NoteCompat)paramf.get(i1)).getDate();
                if ((l4 >= l1) && (l4 < l2)) {
                    if (((NoteCompat)paramf.get(i1)).f() < 0)
                    {
                        if (!a(((NoteCompat)paramf.get(i1)).getDate()).equals(a(l3))) {
                            break label551;
                        }
                        i3 = 1;
                        j = i;
                        i = i3;
                        break label609;
                    }
                }
            }
            for (;;)
            {
                if (i >= 0)
                {
                    i = a(((NoteCompat)paramf.get(i)).getDate(), l2);
                    if ((i4 - i >= Math.abs(localPeriodCompat1.a(true)) + 1) && (i >= 9) && (i <= 20))
                    {
                        localObject += i;
                        i = n + 1;
                        break label628;
                        i3 = Math.abs(a(l3, ((NoteCompat)paramf.get(i1)).getDate()));
                        if (i3 >= k) {
                            break label551;
                        }
                        k = i3;
                        i = j;
                        j = i1;
                        break label609;
                    }
                }
                else
                {
                    i = n;
                    f2 = f1;
                    if (k != 0) {
                        break label592;
                    }
                    j = Math.abs(localPeriodCompat1.a(true));
                    i = n;
                    f2 = f1;
                    if (i4 - m < j + 1) {
                        break label592;
                    }
                    f2 = f1 + m;
                    i = n + 1;
                    break label592;
                    if (n <= 0)
                    {
                        i = m;
                        break;
                    }
                    try
                    {
                        i = new BigDecimal(f1 / n).setScale(0, 4).intValue();
                    }
                    catch (ArithmeticException paramf)
                    {
                        paramf.printStackTrace();
                        r.a().a(paramContext, "DataUtils", 2, paramf, "");
                        i = (int)(f1 / n + 0.5F);
                    }
                    break;
                }
                i = n;
                break label628;
                label551:
                i3 = i;
                i = j;
                j = i3;
                break label609;
                k = j;
            }
            label573:
            i = m;
            break;
            label580:
            float f1 = 0.0F;
            n = 0;
            i2 = 0;
            break label96;
            for (;;)
            {
                label592:
                i2 += 1;
                n = i;
                f1 = f2;
                break;
                label609:
                if (l4 < l2) {
                    break label635;
                }
                k = i;
                i = j;
                break label286;
                label628:
                f2 = f1;
            }
            label635:
            i3 = i1 + 1;
            i1 = j;
            j = i;
            i = i1;
        }
    }

    public static String a(Context paramContext, int paramInt1, int paramInt2)
    {
        if (DateFormat.is24HourFormat(paramContext)) {}
        for (paramContext = new SimpleDateFormat("HH:mm");; paramContext = new SimpleDateFormat("hh:mm aa", Locale.ENGLISH))
        {
            Date localDate = new Date();
            localDate.setHours(paramInt1);
            localDate.setMinutes(paramInt2);
            return paramContext.format(localDate);
        }
    }

    private ArrayList<PeriodCompat> b(Context paramContext)
    {
        int j = 1;
        Object localObject = new ArrayList();
        ArrayList localArrayList4 = a.a();
        int k = localArrayList4.size();
        int i;
        label59:
        ArrayList localArrayList1;
        ArrayList localArrayList3;
        ArrayList localArrayList2;
        switch (a.ak(paramContext))
        {
            default:
                i = 3;
                if (i > k - 1)
                {
                    i = k - 1;
                    if (!a.s(paramContext)) {
                        break label274;
                    }
                    localArrayList1 = new ArrayList();
                    localArrayList3 = new ArrayList();
                    localArrayList2 = new ArrayList();
                    label93:
                    if (j >= i + 1) {
                        break label199;
                    }
                    k = ((PeriodCompat)localArrayList4.get(j)).getPeriod_length();
                    if ((k < 21) || (k > 35)) {
                        break label155;
                    }
                    localArrayList1.add(localArrayList4.get(j));
                }
                break;
        }
        for (;;)
        {
            j += 1;
            break label93;
            i = 1;
            break;
            break label59;
            label155:
            if ((k >= 15) && (k <= 90)) {
                localArrayList3.add(localArrayList4.get(j));
            } else {
                localArrayList2.add(localArrayList4.get(j));
            }
        }
        label199:
        if (localArrayList1.size() >= localArrayList3.size())
        {
            localObject = localArrayList1;
            paramContext = (Context)localObject;
            if (localArrayList1.size() == 0)
            {
                paramContext = (Context)localObject;
                if (localArrayList3.size() == 0) {
                    paramContext = localArrayList2;
                }
            }
        }
        for (;;)
        {
            Collections.sort(paramContext, new Comparator()
            {
                public int a(PeriodCompat paramAnonymousPeriodCompat1, PeriodCompat paramAnonymousPeriodCompat2)
                {
                    if (paramAnonymousPeriodCompat1.getMenses_start() > paramAnonymousPeriodCompat2.getMenses_start()) {
                        return -1;
                    }
                    return 1;
                }
            });
            return paramContext;
            ((ArrayList)localObject).addAll(localArrayList1);
            ((ArrayList)localObject).addAll(localArrayList3);
            break;
            label274:
            paramContext = new ArrayList();
            localObject = new ArrayList();
            j = 1;
            if (j < i + 1)
            {
                k = ((PeriodCompat)localArrayList4.get(j)).getPeriod_length();
                if ((k >= 15) && (k <= 90)) {
                    paramContext.add(localArrayList4.get(j));
                }
                for (;;)
                {
                    j += 1;
                    break;
                    ((ArrayList)localObject).add(localArrayList4.get(j));
                }
            }
            if (paramContext.size() == 0) {
                paramContext = (Context)localObject;
            }
        }
    }

    private long m(long paramLong)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong - 300000L);
        return localCalendar.get(16);
    }

    public int a(long paramLong1, long paramLong2)
    {
        paramLong1 = a(a(paramLong1));
        paramLong2 = a(a(paramLong2));
        return (int)((paramLong2 + (m(paramLong2) - m(paramLong1)) - paramLong1) / 86400000L);
    }

    public int a(Context paramContext)
    {
        ArrayList localArrayList = a.a();
        int j = localArrayList.size();
        double d1 = 0.0D;
        int i = a.ai(paramContext);
        int k;
        switch (i)
        {
            default:
                return 0;
            case 4:
                return a.N(paramContext);
            case 1:
                if (j <= 0) {
                    return a.N(paramContext);
                }
                k = 5;
                i = 0;
                if (((PeriodCompat)localArrayList.get(0)).a(false) < 0)
                {
                    j -= 1;
                    i = 1;
                }
                break;
        }
        for (;;)
        {
            if (j <= 0) {
                return a.N(paramContext);
            }
            if (5 > j) {
                k = j;
            }
            j = 0;
            long l = a.aO(paramContext);
            int m = i;
            if (m < k + i)
            {
                if (((PeriodCompat)localArrayList.get(m)).getMenses_start() <= l) {
                    break label476;
                }
                double d2 = Math.abs(((PeriodCompat)localArrayList.get(m)).a(true));
                j += 1;
                d1 += d2;
            }
            label470:
            label476:
            for (;;)
            {
                m += 1;
                break;
                if (j <= 0) {
                    return a.N(paramContext);
                }
                try
                {
                    i = new BigDecimal(d1 / j).setScale(0, 4).intValue();
                    return i;
                }
                catch (ArithmeticException paramContext)
                {
                    paramContext.printStackTrace();
                    return (int)((float)d1 / j + 0.5F);
                }
                if (j <= 0) {
                    return a.N(paramContext);
                }
                if (i == 0) {
                    i = 1;
                }
                for (;;)
                {
                    m = 0;
                    if (((PeriodCompat)localArrayList.get(0)).a(false) < 0) {
                        k = j - 1;
                    }
                    for (j = 1;; j = m)
                    {
                        if (k <= 0)
                        {
                            return a.N(paramContext);
                            if (i == 2)
                            {
                                i = 6;
                                break;
                            }
                            if (i != 3) {
                                break label470;
                            }
                            i = 3;
                            break;
                        }
                        m = i;
                        if (i > k) {
                            m = k;
                        }
                        k = j;
                        d1 = 0.0D;
                        i = 0;
                        while (k < m + j)
                        {
                            d1 += Math.abs(((PeriodCompat)localArrayList.get(k)).a(true));
                            i += 1;
                            k += 1;
                        }
                        if (i <= 0) {
                            return a.N(paramContext);
                        }
                        try
                        {
                            j = new BigDecimal(d1 / i).setScale(0, 4).intValue();
                            return j;
                        }
                        catch (ArithmeticException paramContext)
                        {
                            paramContext.printStackTrace();
                            return (int)((float)d1 / i + 0.5F);
                        }
                        k = j;
                    }
                    i = 3;
                }
            }
        }
    }

    public int a(Context paramContext, f paramf)
    {
        int k;
        int j;
        for (;;)
        {
            ArrayList localArrayList1;
            try
            {
                localArrayList1 = b(paramContext);
                k = localArrayList1.size();
                i = a.ak(paramContext);
                switch (i)
                {
                    case 4:
                        if (k > 0) {
                            break label118;
                        }
                        i = a.O(paramContext);
                        return i;
                }
            }
            finally {}
            i = a.O(paramContext);
            continue;
            ArrayList localArrayList2 = new ArrayList();
            i = 0;
            if (i < j)
            {
                localArrayList2.add(localArrayList1.get(i));
                i += 1;
            }
            else
            {
                i = a(paramContext, paramf, localArrayList2);
            }
        }
        label118:
        switch (i)
        {
        }
        for (int i = 3;; i = 1)
        {
            j = i;
            if (i <= k) {
                break;
            }
            j = k;
            break;
        }
    }

    public int a(Context paramContext, f paramf, Cell paramCell, long paramLong)
    {
        int i;
        if ((paramCell.getNote() != null) && (paramCell.getNote().f() == 1)) {
            i = 1;
        }
        for (;;)
        {
            Object localObject;
            if ((a.a == null) || (a.a.size() == 0))
            {
                return -1;
                localObject = Calendar.getInstance();
                ((Calendar)localObject).setTimeInMillis(paramLong);
                ((Calendar)localObject).add(5, -1);
                localObject = paramf.a(paramContext, ((Calendar)localObject).getTimeInMillis(), false);
                if ((localObject != null) && (((NoteCompat)localObject).f() == 1)) {
                    i = 1;
                }
            }
            else
            {
                if (paramLong < c(((PeriodCompat)a.a.get(a.a.size() - 1)).getMenses_start())) {
                    return -1;
                }
                if (paramLong >= b(c(((PeriodCompat)a.a.get(0)).getMenses_start()), ((PeriodCompat)a.a.get(0)).getPeriod_length())) {
                    localObject = b(paramContext, paramLong);
                }
                for (;;)
                {
                    int j;
                    if ((localObject == null) || (((PeriodCompat)localObject).isPregnancy()))
                    {
                        return -1;
                        j = 0;
                    }
                    for (;;)
                    {
                        if (j < a.a.size())
                        {
                            if (paramLong >= ((PeriodCompat)a.a.get(j)).getMenses_start())
                            {
                                localObject = (PeriodCompat)a.a.get(j);
                                break;
                            }
                            j += 1;
                            continue;
                            if (i != 0)
                            {
                                paramCell.setPregnancy_chance(2);
                                return paramCell.getPregnancy_chance();
                            }
                            long l = c(((PeriodCompat)localObject).getMenses_start());
                            j = ((PeriodCompat)localObject).getPeriod_length();
                            if (paramLong >= l)
                            {
                                if ((((PeriodCompat)localObject).isPregnancy()) || (paramLong <= b(l, Math.abs(((PeriodCompat)localObject).a(true))))) {
                                    return -1;
                                }
                                int k = a.d.c(paramContext, paramf, (PeriodCompat)localObject);
                                i = Math.abs(((PeriodCompat)localObject).a(true));
                                j -= k;
                                if ((((PeriodCompat)localObject).getPeriod_length() < 21) || (j < i + 1))
                                {
                                    paramCell.setPregnancy_chance(0);
                                    return paramCell.getPregnancy_chance();
                                }
                                l = b(l, j);
                                if ((paramLong == l) || (paramLong == b(l, -1)) || (paramLong == b(l, -2)))
                                {
                                    paramCell.setPregnancy_chance(2);
                                    return paramCell.getPregnancy_chance();
                                }
                                if ((paramLong >= b(l, -5)) && (paramLong <= b(l, 4)) && (paramLong < b(c(((PeriodCompat)localObject).getMenses_start()), ((PeriodCompat)localObject).getPeriod_length())))
                                {
                                    paramCell.setPregnancy_chance(1);
                                    return paramCell.getPregnancy_chance();
                                }
                                paramCell.setPregnancy_chance(0);
                                return paramCell.getPregnancy_chance();
                            }
                            return -1;
                        }
                    }
                    localObject = null;
                }
            }
            i = 0;
        }
    }

    public long a()
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(System.currentTimeMillis());
        localCalendar.set(localCalendar.get(1), localCalendar.get(2), localCalendar.get(5), 0, 0, 0);
        localCalendar.set(14, 0);
        return localCalendar.getTimeInMillis();
    }

    public long a(int paramInt1, int paramInt2, int paramInt3)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.clear();
        localCalendar.set(paramInt1, paramInt2, paramInt3);
        return localCalendar.getTimeInMillis();
    }

    public long a(long paramLong, Context paramContext)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        int i = localCalendar.get(7);
        switch (a.l(paramContext))
        {
            default:
                return 0L;
            case 0:
                return b(paramLong, 1 - i);
            case 1:
                if (i > 1) {}
                for (i = 2 - i;; i = -6) {
                    return b(paramLong, i);
                }
        }
        return b(paramLong, 0 - i);
    }

    public long a(Context paramContext, long paramLong1, long paramLong2)
    {
        ArrayList localArrayList = new ArrayList();
        int i = 0;
        while (i < a.a.size())
        {
            localArrayList.add(a.a.get(i));
            i += 1;
        }
        PeriodCompat localPeriodCompat = (PeriodCompat)a.a.get(0);
        long l = 0L;
        if (localPeriodCompat.getPeriod_length() != 0) {
            l = (paramLong2 - localPeriodCompat.getMenses_start()) / (localPeriodCompat.getPeriod_length() * 24L * 60L * 60L * 1000L);
        }
        if ((!localPeriodCompat.isPregnancy()) && (l > 0L))
        {
            int j = -a.d.a(paramContext);
            i = 0;
            while (i < l)
            {
                paramContext = new PeriodCompat();
                paramContext.setMenses_start(b(((PeriodCompat)localArrayList.get(0)).getMenses_start(), ((PeriodCompat)localArrayList.get(0)).getPeriod_length()));
                paramContext.setMenses_length(j);
                paramContext.setPeriod_length(((PeriodCompat)localArrayList.get(0)).getPeriod_length());
                localArrayList.add(0, paramContext);
                i += 1;
            }
        }
        i = 0;
        while (i < localArrayList.size())
        {
            if (paramLong1 > ((PeriodCompat)localArrayList.get(i)).getMenses_start()) {
                return ((PeriodCompat)localArrayList.get(i)).getMenses_start();
            }
            i += 1;
        }
        return 0L;
    }

    public long a(String paramString)
    {
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date localDate = new Date();
        try
        {
            paramString = localSimpleDateFormat.parse(paramString);
            return paramString.getTime();
        }
        catch (Exception paramString)
        {
            for (;;)
            {
                paramString.printStackTrace();
                paramString = localDate;
            }
        }
    }

    public Cell a(Context paramContext, f paramf, long paramLong, boolean paramBoolean)
    {
        Cell localCell = new Cell();
        int j = a.a.size();
        int i;
        PeriodCompat localPeriodCompat;
        long l;
        if ((j > 0) && (paramLong >= c(((PeriodCompat)a.a.get(j - 1)).getMenses_start())))
        {
            if (paramLong > b(c(((PeriodCompat)a.a.get(0)).getMenses_start()), ((PeriodCompat)a.a.get(0)).getPeriod_length())) {
                break label292;
            }
            i = 0;
            if (i < j)
            {
                localPeriodCompat = (PeriodCompat)a.a.get(i);
                l = c(localPeriodCompat.getMenses_start());
                if (paramLong < l) {
                    break label283;
                }
                if (paramLong != l) {
                    break label203;
                }
                localCell.setMensesStart(true);
                localCell.setMensesDay(true);
                if (localPeriodCompat.a(false) == 0) {
                    localCell.setMensesEnd(true);
                }
                localCell.getNote().setDate(localPeriodCompat.getMenses_start());
                label174:
                localCell.setPeriod(localPeriodCompat);
            }
        }
        for (;;)
        {
            paramf = paramf.a(paramContext, paramLong, paramBoolean);
            if (paramf == null) {
                break label301;
            }
            localCell.setNote(paramf);
            return localCell;
            label203:
            if ((paramLong > l) && (paramLong < b(l, Math.abs(localPeriodCompat.a(true)))))
            {
                localCell.setMensesDay(true);
                break label174;
            }
            if (paramLong != b(l, Math.abs(localPeriodCompat.a(true)))) {
                break label174;
            }
            if (localPeriodCompat.a(false) >= 0) {
                localCell.setMensesEnd(true);
            }
            localCell.setMensesDay(true);
            break label174;
            label283:
            i += 1;
            break;
            label292:
            localCell.setPrediction(true);
        }
        label301:
        if (!localCell.isMensesStart()) {
            localCell.getNote().setDate(paramLong);
        }
        localCell.getNote().setUid(a.f(paramContext));
        return localCell;
    }

    public PeriodCompat a(Context paramContext, long paramLong)
    {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll(a.a);
        if (localArrayList.size() <= 0) {
            return null;
        }
        PeriodCompat localPeriodCompat = (PeriodCompat)a.a.get(0);
        long l1 = 0L;
        if (localPeriodCompat.getPeriod_length() != 0) {
            l1 = (paramLong - localPeriodCompat.getMenses_start()) / (localPeriodCompat.getPeriod_length() * 24L * 60L * 60L * 1000L);
        }
        int j;
        int i;
        if (l1 > 0L)
        {
            j = -a.d.a(paramContext);
            i = 0;
            while (i < l1)
            {
                paramContext = new PeriodCompat();
                paramContext.setMenses_start(b(((PeriodCompat)localArrayList.get(0)).getMenses_start(), ((PeriodCompat)localArrayList.get(0)).getPeriod_length()));
                paramContext.setMenses_length(j);
                paramContext.setPeriod_length(((PeriodCompat)localArrayList.get(0)).getPeriod_length());
                localArrayList.add(0, paramContext);
                i += 1;
            }
        }
        if (paramLong <= c(((PeriodCompat)localArrayList.get(localArrayList.size() - 1)).getMenses_start())) {
            return (PeriodCompat)localArrayList.get(localArrayList.size() - 1);
        }
        if (localArrayList.size() > 1)
        {
            if (paramLong >= c(((PeriodCompat)localArrayList.get(0)).getMenses_start())) {
                return (PeriodCompat)localArrayList.get(0);
            }
            j = localArrayList.size() - 1;
            i = 1;
            if (j >= i)
            {
                int k = (j + i) / 2;
                l1 = c(((PeriodCompat)localArrayList.get(k)).getMenses_start());
                long l2 = c(((PeriodCompat)localArrayList.get(k - 1)).getMenses_start());
                if ((paramLong >= l1) && (paramLong < l2)) {
                    return (PeriodCompat)localArrayList.get(k);
                }
                if (paramLong >= l2) {
                    j = k - 1;
                }
                for (;;)
                {
                    break;
                    i = k + 1;
                }
            }
        }
        else
        {
            return (PeriodCompat)localArrayList.get(0);
        }
        return null;
    }

    public String a(int paramInt1, int paramInt2)
    {
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("HH:mm");
        Date localDate = new Date();
        localDate.setHours(paramInt1);
        localDate.setMinutes(paramInt2);
        return localSimpleDateFormat.format(localDate);
    }

    public String a(int paramInt, Locale paramLocale)
    {
        if (paramLocale == null)
        {
            switch (paramInt)
            {
                default:
                    return paramInt + "th";
                case 0:
                    return paramInt + "";
                case 1:
                    return paramInt + "st";
                case 2:
                    return paramInt + "nd";
            }
            return paramInt + "rd";
        }
        paramLocale = paramLocale.getLanguage().toLowerCase();
        if (paramLocale.equals("zh")) {
            return "第" + paramInt;
        }
        if ((paramLocale.equals("hr")) || (paramLocale.equals("de")) || (paramLocale.equals("cs")) || (paramLocale.equals("sk")) || (paramLocale.equals("fi"))) {
            return paramInt + ".";
        }
        if ((paramLocale.equals("fr")) || (paramLocale.equals("hu")) || (paramLocale.equals("ar")) || (paramLocale.equals("in")) || (paramLocale.equals("ja")) || (paramLocale.equals("nl")) || (paramLocale.equals("tr")) || (paramLocale.equals("pl")) || (paramLocale.equals("ko"))) {
            return paramInt + "";
        }
        if ((paramLocale.equals("es")) || (paramLocale.equals("it")) || (paramLocale.equals("pt"))) {
            return paramInt + "°";
        }
        if (paramLocale.equals("ru")) {
            return paramInt + "";
        }
        if (paramLocale.equals("bg"))
        {
            switch (paramInt)
            {
                default:
                    return paramInt + "ти";
                case 0:
                    return paramInt + "";
                case 1:
                    return paramInt + "ви";
            }
            return paramInt + "ри";
        }
        if (paramLocale.equals("ro"))
        {
            switch (paramInt)
            {
                default:
                    return "a " + paramInt;
            }
            return paramInt + "";
        }
        if (paramLocale.equals("el")) {
            return paramInt + "η";
        }
        switch (paramInt)
        {
            default:
                return paramInt + "th";
            case 0:
                return paramInt + "";
            case 1:
                return paramInt + "st";
            case 2:
                return paramInt + "nd";
        }
        return paramInt + "rd";
    }

    public String a(long paramLong)
    {
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date localDate = new Date();
        localDate.setTime(paramLong);
        return localSimpleDateFormat.format(localDate);
    }

    public String a(long paramLong, int paramInt)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.add(5, paramInt);
        return a(localCalendar.getTimeInMillis());
    }

    public String a(Context paramContext, long paramLong, Locale paramLocale)
    {
        Locale localLocale = paramLocale;
        if (a.b(paramLocale)) {
            localLocale = Locale.ENGLISH;
        }
        paramLocale = new Date();
        paramLocale.setTime(paramLong);
        switch (a.m(paramContext))
        {
            default:
                return "";
            case 0:
                return new SimpleDateFormat("dd/MM/yyyy", localLocale).format(paramLocale);
            case 1:
                return new SimpleDateFormat("MM/dd/yyyy", localLocale).format(paramLocale);
            case 2:
                return new SimpleDateFormat("yyyy/MM/dd", localLocale).format(paramLocale);
            case 3:
                return new SimpleDateFormat("dd MM yyyy", localLocale).format(paramLocale);
            case 4:
                return new SimpleDateFormat("yyyy MM dd", localLocale).format(paramLocale);
            case 5:
                return new SimpleDateFormat("yyyy-MM-dd", localLocale).format(paramLocale);
            case 6:
                if (localLocale.getLanguage().toLowerCase(Locale.ENGLISH).equals("zh")) {}
                for (paramContext = new SimpleDateFormat("MM月dd日, yyyy", localLocale);; paramContext = new SimpleDateFormat("MMM d, yyyy", localLocale)) {
                    return paramContext.format(paramLocale);
                }
            case 7:
                if (localLocale.getLanguage().toLowerCase(Locale.ENGLISH).equals("zh")) {
                    paramContext = new SimpleDateFormat("dd日 MM月, yyyy", localLocale);
                }
                for (;;)
                {
                    return paramContext.format(paramLocale);
                    if (localLocale.getLanguage().toLowerCase(Locale.ENGLISH).equals("de")) {
                        paramContext = new SimpleDateFormat("d. MMM yyyy", localLocale);
                    } else {
                        paramContext = new SimpleDateFormat("d MMM, yyyy", localLocale);
                    }
                }
            case 8:
                if (localLocale.getLanguage().toLowerCase(Locale.ENGLISH).equals("zh")) {}
                for (paramContext = new SimpleDateFormat("yyyy年MM月dd日", localLocale);; paramContext = new SimpleDateFormat("yyyy MMM d", localLocale)) {
                    return paramContext.format(paramLocale);
                }
        }
        return u.a(paramContext, localLocale).format(paramLocale);
    }

    public ArrayList<e> a(Context paramContext, long paramLong, int paramInt)
    {
        ArrayList localArrayList1 = new ArrayList();
        i locali = new i();
        long l2 = h(paramLong);
        int i = 1;
        while (i <= paramInt)
        {
            long l1 = l2;
            if (i != 1) {
                l1 = k(l2);
            }
            ArrayList localArrayList2 = locali.a(paramContext, this, a.b, l1);
            int j = localArrayList2.size() - 1;
            if (j >= 0)
            {
                e locale = new e();
                Cell localCell = (Cell)localArrayList2.get(j);
                NoteCompat localNoteCompat = localCell.getNote();
                l2 = localNoteCompat.getDate();
                if (l2 <= paramLong)
                {
                    locale.a(l2);
                    if (!localNoteCompat.isIntimate()) {
                        break label171;
                    }
                    locale.a(true);
                    locale.a(localCell.getPregnancy_chance());
                }
                for (;;)
                {
                    localArrayList1.add(locale);
                    j -= 1;
                    break;
                    label171:
                    locale.a(false);
                }
            }
            i += 1;
            l2 = l1;
        }
        return localArrayList1;
    }

    public HashMap<Long, NoteCompat> a(Context paramContext, f paramf, long paramLong1, long paramLong2)
    {
        HashMap localHashMap = new HashMap();
        Calendar localCalendar = Calendar.getInstance();
        paramContext = paramf.a(paramContext, paramLong1, paramLong2);
        paramf = paramContext.keySet().iterator();
        while (paramf.hasNext())
        {
            NoteCompat localNoteCompat = (NoteCompat)paramContext.get(paramf.next());
            localCalendar.setTimeInMillis(localNoteCompat.getDate());
            String str = a.d.a(localNoteCompat.getDate());
            localHashMap.put(Long.valueOf(a.d.a(str)), localNoteCompat);
        }
        return localHashMap;
    }

    public LinkedHashMap<Integer, String> a(Context paramContext, String paramString)
    {
        paramString = new LinkedHashMap();
        Object localObject1 = new c(paramContext).a();
        Object localObject2 = ((LinkedHashMap)localObject1).keySet().iterator();
        Object localObject3;
        while (((Iterator)localObject2).hasNext())
        {
            localObject3 = (Integer)((Iterator)localObject2).next();
            paramString.put(localObject3, paramContext.getResources().getString(((Integer)((HashMap)((LinkedHashMap)localObject1).get(localObject3)).get("name")).intValue()));
        }
        localObject1 = a.ap(paramContext);
        if (!((String)localObject1).equals("")) {
            try
            {
                localObject1 = new JSONObject((String)localObject1).getJSONArray("mood_rename_list");
                int i = 0;
                while (i < ((JSONArray)localObject1).length())
                {
                    localObject2 = ((JSONArray)localObject1).getJSONObject(i);
                    localObject3 = paramString.keySet().iterator();
                    while (((Iterator)localObject3).hasNext())
                    {
                        Integer localInteger = (Integer)((Iterator)localObject3).next();
                        if (((JSONObject)localObject2).has(localInteger + "")) {
                            paramString.put(localInteger, (String)((JSONObject)localObject2).get(localInteger + ""));
                        }
                    }
                    i += 1;
                }
                return paramString;
            }
            catch (JSONException localJSONException)
            {
                r.a().a(paramContext, "DataUtils", 1, localJSONException, "");
                localJSONException.printStackTrace();
            }
        }
    }

    public boolean a(Context paramContext, f paramf, long paramLong)
    {
        int j = a.a.size();
        boolean bool2;
        if (j <= 0)
        {
            bool2 = false;
            return bool2;
        }
        PeriodCompat localPeriodCompat = (PeriodCompat)a.a.get(0);
        int i;
        boolean bool1;
        if (paramLong >= localPeriodCompat.getMenses_start())
        {
            i = a(a(a(localPeriodCompat.getMenses_start())), a(a(paramLong)));
            localPeriodCompat.setMenses_length(i);
            if (localPeriodCompat.getPeriod_length() < i + 1) {
                localPeriodCompat.setPeriod_length(i + 1 + 5);
            }
            paramf.b(paramContext, localPeriodCompat);
            bool1 = true;
        }
        for (;;)
        {
            bool2 = bool1;
            if (!bool1) {
                break;
            }
            d.a().a(paramContext, true);
            return bool1;
            i = 0;
            for (;;)
            {
                if (i < j - 1)
                {
                    long l1 = ((PeriodCompat)a.a.get(i)).getMenses_start();
                    long l2 = ((PeriodCompat)a.a.get(i + 1)).getMenses_start();
                    if ((paramLong < l1) && (paramLong >= l2))
                    {
                        j = a(a(a(((PeriodCompat)a.a.get(i + 1)).getMenses_start())), a(a(paramLong)));
                        ((PeriodCompat)a.a.get(i + 1)).setMenses_length(j);
                        paramf.b(paramContext, (PeriodCompat)a.a.get(i + 1));
                        if (j < 14) {
                            break label321;
                        }
                        r.a().a(paramContext, "经期长度统计", j + "", "", null);
                        bool1 = true;
                        break;
                    }
                    i += 1;
                    continue;
                    label321:
                    bool1 = true;
                    break;
                }
            }
            bool1 = false;
        }
    }

    public boolean a(Context paramContext, f paramf, NoteCompat paramNoteCompat)
    {
        if (paramNoteCompat.m() != -1L)
        {
            if ((paramNoteCompat.getMoods().equals("")) && (paramNoteCompat.getNote().equals("")) && (paramNoteCompat.getPill().equals("")) && (paramNoteCompat.getSymptoms().equals("")) && (paramNoteCompat.getTemperature() == 0.0D) && (paramNoteCompat.getWeight() == 0.0D) && (!paramNoteCompat.isIntimate()) && (paramNoteCompat.e() == 0.0D) && (paramNoteCompat.b().equals("")) && (paramNoteCompat.k() == 0)) {}
            for (int i = 1; i != 0; i = 0) {
                return paramf.b(paramContext, paramNoteCompat.m());
            }
            return paramf.b(paramContext, paramNoteCompat);
        }
        return paramf.a(paramContext, paramNoteCompat);
    }

    public boolean a(Context paramContext, f paramf, PeriodCompat paramPeriodCompat)
    {
        return a(paramContext, paramf, paramPeriodCompat, false);
    }

    public boolean a(Context paramContext, f paramf, PeriodCompat paramPeriodCompat, boolean paramBoolean)
    {
        boolean bool = false;
        if ((paramPeriodCompat.getMenses_start() < 315550800000L) || (paramPeriodCompat.getMenses_start() > 2524626000000L)) {}
        while (paramf.c(paramContext, paramPeriodCompat)) {
            return false;
        }
        paramPeriodCompat.setUid(a.f(paramContext));
        int i;
        if (!paramBoolean)
        {
            i = a.d.a(paramContext);
            if (i == 0)
            {
                i = Integer.MIN_VALUE;
                paramPeriodCompat.setMenses_length(i);
            }
        }
        else
        {
            if (a.a.size() != 0) {
                break label205;
            }
            if (!paramPeriodCompat.isPregnancy()) {
                paramPeriodCompat.setPeriod_length(b(paramContext, paramPeriodCompat));
            }
            if (!paramf.a(paramContext, paramPeriodCompat)) {
                break label890;
            }
            a.a.add(paramPeriodCompat);
        }
        label120:
        label205:
        label535:
        label850:
        label878:
        label884:
        label890:
        for (paramBoolean = true;; paramBoolean = false)
        {
            if (paramBoolean)
            {
                d.a().a(paramContext, true);
                r.a().b(paramContext, "经期输入总入口", "", "", null);
                if (a.a.size() != 2) {}
            }
            try
            {
                if (paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode == 113) {
                    r.a().c(paramContext, "经期统计", "输入二次经期开始", "", null);
                }
                return paramBoolean;
                i = -i;
                break;
                if (paramPeriodCompat.getMenses_start() < ((PeriodCompat)a.a.get(a.a.size() - 1)).getMenses_start())
                {
                    paramPeriodCompat.setPeriod_length(a(paramPeriodCompat.getMenses_start(), ((PeriodCompat)a.a.get(a.a.size() - 1)).getMenses_start()));
                    if (!paramf.a(paramContext, paramPeriodCompat)) {
                        break label884;
                    }
                    a.a.add(paramPeriodCompat);
                    paramBoolean = true;
                    ((PeriodCompat)a.a.get(0)).setPeriod_length(b(paramContext, (PeriodCompat)a.a.get(0)));
                    paramf.b(paramContext, (PeriodCompat)a.a.get(0));
                    break label120;
                }
                PeriodCompat localPeriodCompat;
                if (paramPeriodCompat.getMenses_start() > ((PeriodCompat)a.a.get(0)).getMenses_start())
                {
                    localPeriodCompat = (PeriodCompat)a.a.get(0);
                    i = a(localPeriodCompat.getMenses_start(), paramPeriodCompat.getMenses_start());
                    if (!localPeriodCompat.isPregnancy())
                    {
                        localPeriodCompat.setPeriod_length(i);
                        paramf.b(paramContext, localPeriodCompat);
                    }
                    while (paramPeriodCompat.getMenses_start() >= b(localPeriodCompat.getMenses_start(), localPeriodCompat.getPeriod_length()))
                    {
                        a.a.add(0, paramPeriodCompat);
                        if (!paramPeriodCompat.isPregnancy()) {
                            paramPeriodCompat.setPeriod_length(b(paramContext, paramPeriodCompat));
                        }
                        paramBoolean = bool;
                        if (paramf.a(paramContext, paramPeriodCompat)) {
                            paramBoolean = true;
                        }
                        break;
                    }
                    localPeriodCompat.setPeriod_length(i);
                    if (localPeriodCompat.getPeriod_length() < Math.abs(localPeriodCompat.a(true))) {
                        if (localPeriodCompat.a(false) <= 0) {
                            break label535;
                        }
                    }
                    for (i = localPeriodCompat.getPeriod_length();; i = -localPeriodCompat.getPeriod_length())
                    {
                        localPeriodCompat.setMenses_length(i);
                        paramf.b(paramContext, (PeriodCompat)a.a.get(0));
                        break;
                    }
                }
                int j = a.a.size();
                long l = paramPeriodCompat.getMenses_start();
                i = 0;
                for (;;)
                {
                    if (i >= j - 1) {
                        break label878;
                    }
                    if ((l < ((PeriodCompat)a.a.get(i)).getMenses_start()) && (l > ((PeriodCompat)a.a.get(i + 1)).getMenses_start()))
                    {
                        localPeriodCompat = (PeriodCompat)a.a.get(i + 1);
                        if (!localPeriodCompat.isPregnancy())
                        {
                            localPeriodCompat.setPeriod_length(a(localPeriodCompat.getMenses_start(), paramPeriodCompat.getMenses_start()));
                            paramf.b(paramContext, localPeriodCompat);
                        }
                        while (paramPeriodCompat.getMenses_start() >= b(localPeriodCompat.getMenses_start(), localPeriodCompat.getPeriod_length()))
                        {
                            paramPeriodCompat.setPeriod_length(a(paramPeriodCompat.getMenses_start(), ((PeriodCompat)a.a.get(i)).getMenses_start()));
                            if (!paramf.a(paramContext, paramPeriodCompat)) {
                                break label878;
                            }
                            a.a.add(i + 1, paramPeriodCompat);
                            paramBoolean = true;
                            ((PeriodCompat)a.a.get(0)).setPeriod_length(b(paramContext, (PeriodCompat)a.a.get(0)));
                            paramf.b(paramContext, (PeriodCompat)a.a.get(0));
                            break;
                        }
                        localPeriodCompat.setPeriod_length(a(localPeriodCompat.getMenses_start(), paramPeriodCompat.getMenses_start()));
                        if (localPeriodCompat.getPeriod_length() < Math.abs(localPeriodCompat.a(true))) {
                            if (localPeriodCompat.a(false) <= 0) {
                                break label850;
                            }
                        }
                        for (j = localPeriodCompat.getPeriod_length();; j = -localPeriodCompat.getPeriod_length())
                        {
                            localPeriodCompat.setMenses_length(j);
                            paramf.b(paramContext, localPeriodCompat);
                            break;
                        }
                    }
                    i += 1;
                }
            }
            catch (Exception paramContext)
            {
                for (;;)
                {
                    paramContext.printStackTrace();
                    continue;
                    paramBoolean = false;
                    continue;
                    paramBoolean = false;
                }
            }
        }
    }

    public boolean a(Context paramContext, PeriodCompat paramPeriodCompat)
    {
        if (a.b.b(paramContext, paramPeriodCompat))
        {
            d.a().a(paramContext, true);
            return true;
        }
        return false;
    }

    public int b(Context paramContext, PeriodCompat paramPeriodCompat)
    {
        if (paramPeriodCompat.isPregnancy()) {
            return 280;
        }
        ArrayList localArrayList3 = a.a();
        int m = localArrayList3.size();
        double d = 0.0D;
        int i = a.aj(paramContext);
        label93:
        int j;
        boolean bool;
        Object localObject;
        long l;
        ArrayList localArrayList1;
        ArrayList localArrayList4;
        ArrayList localArrayList2;
        int k;
        label205:
        int n;
        switch (i)
        {
            default:
                return 0;
            case 0:
            case 2:
            case 3:
                if (i == 0)
                {
                    i = 1;
                    if (i <= m - 1) {
                        break label931;
                    }
                    i = m - 1;
                    if (m > 1) {
                        break label934;
                    }
                    return a.s(paramContext, 28);
                }
                break;
            case 4:
                return a.s(paramContext, 28);
            case 1:
                if (5 > m - 1) {}
                for (j = m - 1; m <= 1; j = 5) {
                    return a.s(paramContext, 28);
                }
                bool = a.s(paramContext);
                localObject = new ArrayList();
                l = a.aN(paramContext);
                if (bool)
                {
                    localArrayList1 = new ArrayList();
                    localArrayList4 = new ArrayList();
                    localArrayList2 = new ArrayList();
                    i = 0;
                    k = 1;
                    if (k < j + 1)
                    {
                        n = ((PeriodCompat)localArrayList3.get(k)).getPeriod_length();
                        if (((PeriodCompat)localArrayList3.get(k)).getMenses_start() < l) {
                            break label1308;
                        }
                        if ((n >= 21) && (n <= 35))
                        {
                            localArrayList1.add(Integer.valueOf(n));
                            label273:
                            i += 1;
                        }
                    }
                }
                break;
        }
        label472:
        label556:
        label598:
        label683:
        label823:
        label837:
        label931:
        label934:
        label1305:
        label1308:
        for (;;)
        {
            k += 1;
            break label205;
            if ((n >= 15) && (n <= 90))
            {
                localArrayList4.add(Integer.valueOf(n));
                break label273;
            }
            localArrayList2.add(Integer.valueOf(n));
            break label273;
            if ((l != 0L) && (i < 5))
            {
                i = a.s(paramContext, 28);
                if ((i >= 21) && (i <= 35)) {
                    localArrayList1.add(Integer.valueOf(i));
                }
            }
            else
            {
                if ((l == 0L) && (m == 2) && (localArrayList2.size() > 0))
                {
                    i = a.s(paramContext, 28);
                    if ((i >= 15) && (i <= 90)) {
                        localArrayList4.add(Integer.valueOf(i));
                    }
                }
                if (localArrayList1.size() < localArrayList4.size()) {
                    break label556;
                }
                localObject = localArrayList1;
            }
            for (;;)
            {
                paramPeriodCompat = (PeriodCompat)localObject;
                if (localArrayList1.size() == 0)
                {
                    paramPeriodCompat = (PeriodCompat)localObject;
                    if (localArrayList4.size() == 0) {
                        paramPeriodCompat = localArrayList2;
                    }
                }
                paramPeriodCompat = paramPeriodCompat.iterator();
                i = 0;
                while (paramPeriodCompat.hasNext())
                {
                    d = ((Integer)paramPeriodCompat.next()).intValue() + d;
                    i += 1;
                }
                if ((i >= 15) && (i <= 90))
                {
                    localArrayList4.add(Integer.valueOf(i));
                    break;
                }
                localArrayList2.add(Integer.valueOf(i));
                break;
                ((ArrayList)localObject).addAll(localArrayList1);
                ((ArrayList)localObject).addAll(localArrayList4);
            }
            paramPeriodCompat = new ArrayList();
            localObject = new ArrayList();
            i = 0;
            k = 1;
            if (k < j + 1)
            {
                n = ((PeriodCompat)localArrayList3.get(k)).getPeriod_length();
                if (((PeriodCompat)localArrayList3.get(k)).getMenses_start() < l) {
                    break label1305;
                }
                if (l < ((PeriodCompat)localArrayList3.get(0)).getMenses_start())
                {
                    if ((n >= 15) && (n <= 90)) {
                        paramPeriodCompat.add(Integer.valueOf(n));
                    }
                }
                else {
                    i += 1;
                }
            }
            for (;;)
            {
                k += 1;
                break label598;
                ((ArrayList)localObject).add(Integer.valueOf(n));
                break label683;
                if ((l != 0L) && (i < 5))
                {
                    i = a.s(paramContext, 28);
                    if ((i < 15) || (i > 90)) {
                        break label823;
                    }
                    paramPeriodCompat.add(Integer.valueOf(i));
                }
                for (;;)
                {
                    if ((l == 0L) && (m == 2) && (((ArrayList)localObject).size() > 0))
                    {
                        i = a.s(paramContext, 28);
                        if ((i >= 15) && (i <= 90)) {
                            paramPeriodCompat.add(Integer.valueOf(i));
                        }
                    }
                    if (paramPeriodCompat.size() != 0) {
                        break label837;
                    }
                    paramPeriodCompat = (PeriodCompat)localObject;
                    break;
                    ((ArrayList)localObject).add(Integer.valueOf(i));
                }
                break label472;
                if (i > 0) {
                    try
                    {
                        j = new BigDecimal(d / i).setScale(0, 4).intValue();
                        return j;
                    }
                    catch (ArithmeticException paramPeriodCompat)
                    {
                        r.a().a(paramContext, "DataUtils", 0, paramPeriodCompat, "");
                        paramPeriodCompat.printStackTrace();
                        return (int)((float)d / i + 0.5F);
                    }
                }
                return a.s(paramContext, 28);
                if (i == 2)
                {
                    i = 6;
                    break;
                }
                if (i == 3)
                {
                    i = 3;
                    break;
                    break label93;
                    bool = a.s(paramContext);
                    paramPeriodCompat = new ArrayList();
                    if (bool)
                    {
                        localArrayList1 = new ArrayList();
                        localArrayList4 = new ArrayList();
                        localArrayList2 = new ArrayList();
                        j = 1;
                        if (j < i + 1)
                        {
                            k = ((PeriodCompat)localArrayList3.get(j)).getPeriod_length();
                            if ((k >= 21) && (k <= 35)) {
                                localArrayList1.add(Integer.valueOf(k));
                            }
                            for (;;)
                            {
                                j += 1;
                                break;
                                if ((k >= 15) && (k <= 90)) {
                                    localArrayList4.add(Integer.valueOf(k));
                                } else {
                                    localArrayList2.add(Integer.valueOf(k));
                                }
                            }
                        }
                        if (localArrayList1.size() >= localArrayList4.size())
                        {
                            paramPeriodCompat = localArrayList1;
                            localObject = paramPeriodCompat;
                            if (localArrayList1.size() == 0)
                            {
                                localObject = paramPeriodCompat;
                                if (localArrayList4.size() != 0) {}
                            }
                        }
                    }
                    for (localObject = localArrayList2;; localObject = paramPeriodCompat)
                    {
                        paramPeriodCompat = ((ArrayList)localObject).iterator();
                        i = 0;
                        for (;;)
                        {
                            if (paramPeriodCompat.hasNext())
                            {
                                d += ((Integer)paramPeriodCompat.next()).intValue();
                                i += 1;
                                continue;
                                paramPeriodCompat.addAll(localArrayList1);
                                paramPeriodCompat.addAll(localArrayList4);
                                break;
                                j = 1;
                                while (j < i + 1)
                                {
                                    paramPeriodCompat.add(Integer.valueOf(((PeriodCompat)localArrayList3.get(j)).getPeriod_length()));
                                    j += 1;
                                }
                            }
                        }
                        if (i > 0) {
                            try
                            {
                                j = new BigDecimal(d / i).setScale(0, 4).intValue();
                                return j;
                            }
                            catch (ArithmeticException paramPeriodCompat)
                            {
                                r.a().a(paramContext, "DataUtils", 0, paramPeriodCompat, "");
                                paramPeriodCompat.printStackTrace();
                                return (int)((float)d / i + 0.5F);
                            }
                        }
                        return a.s(paramContext, 28);
                    }
                }
                i = 5;
                break;
            }
        }
    }

    public long b(long paramLong, int paramInt)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.add(5, paramInt);
        return localCalendar.getTimeInMillis();
    }

    public PeriodCompat b(Context paramContext, long paramLong)
    {
        ArrayList localArrayList = a.a();
        if (localArrayList.size() <= 0) {
            return null;
        }
        PeriodCompat localPeriodCompat = (PeriodCompat)a.a.get(0);
        long l1 = 0L;
        if (localPeriodCompat.getPeriod_length() != 0) {
            l1 = a.d.a(localPeriodCompat.getMenses_start(), paramLong) / localPeriodCompat.getPeriod_length();
        }
        int j;
        int i;
        if (l1 > 0L)
        {
            j = -a.d.a(paramContext);
            i = 0;
            while (i < l1)
            {
                paramContext = new PeriodCompat();
                paramContext.setMenses_start(b(((PeriodCompat)localArrayList.get(0)).getMenses_start(), ((PeriodCompat)localArrayList.get(0)).getPeriod_length()));
                paramContext.setMenses_length(j);
                paramContext.setPeriod_length(((PeriodCompat)localArrayList.get(0)).getPeriod_length());
                localArrayList.add(0, paramContext);
                i += 1;
            }
        }
        if (paramLong <= c(((PeriodCompat)localArrayList.get(localArrayList.size() - 1)).getMenses_start())) {
            return (PeriodCompat)localArrayList.get(localArrayList.size() - 1);
        }
        if (localArrayList.size() > 1)
        {
            if (paramLong >= c(((PeriodCompat)localArrayList.get(0)).getMenses_start())) {
                return (PeriodCompat)localArrayList.get(0);
            }
            j = localArrayList.size() - 1;
            i = 1;
            if (j >= i)
            {
                int k = (j + i) / 2;
                l1 = c(((PeriodCompat)localArrayList.get(k)).getMenses_start());
                long l2 = c(((PeriodCompat)localArrayList.get(k - 1)).getMenses_start());
                if ((paramLong >= l1) && (paramLong < l2)) {
                    return (PeriodCompat)localArrayList.get(k);
                }
                if (paramLong >= l2) {
                    j = k - 1;
                }
                for (;;)
                {
                    break;
                    i = k + 1;
                }
            }
        }
        else
        {
            return (PeriodCompat)localArrayList.get(0);
        }
        return null;
    }

    public String b(int paramInt1, int paramInt2)
    {
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("hh:mm aa", Locale.ENGLISH);
        Date localDate = new Date();
        localDate.setHours(paramInt1);
        localDate.setMinutes(paramInt2);
        return localSimpleDateFormat.format(localDate);
    }

    public String b(long paramLong)
    {
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.ENGLISH);
        Date localDate = new Date();
        localDate.setTime(paramLong);
        return localSimpleDateFormat.format(localDate);
    }

    public String b(Context paramContext, long paramLong, Locale paramLocale)
    {
        Locale localLocale = paramLocale;
        if (a.b(paramLocale)) {
            localLocale = Locale.ENGLISH;
        }
        paramLocale = null;
        Date localDate = new Date();
        localDate.setTime(paramLong);
        switch (a.m(paramContext))
        {
            default:
                paramContext = paramLocale;
                paramLocale = paramContext.format(localDate);
                paramContext = paramLocale;
                if (localLocale.getLanguage().toLowerCase().equals("fi"))
                {
                    if (!paramLocale.contains("tammikuuta")) {
                        break label401;
                    }
                    paramContext = paramLocale.replace("tammikuuta", "tam");
                }
                break;
        }
        label401:
        do
        {
            return paramContext;
            paramContext = new SimpleDateFormat("dd/MM", localLocale);
            break;
            paramContext = new SimpleDateFormat("MM/dd", localLocale);
            break;
            paramContext = new SimpleDateFormat("MM/dd", localLocale);
            break;
            paramContext = new SimpleDateFormat("dd MM", localLocale);
            break;
            paramContext = new SimpleDateFormat("MM dd", localLocale);
            break;
            paramContext = new SimpleDateFormat("MM-dd", localLocale);
            break;
            if (localLocale.getLanguage().toLowerCase().equals("zh"))
            {
                paramContext = new SimpleDateFormat("MM月dd日", localLocale);
                break;
            }
            paramContext = new SimpleDateFormat("MMM d", localLocale);
            break;
            if (localLocale.getLanguage().toLowerCase().equals("zh"))
            {
                paramContext = new SimpleDateFormat("dd日 MM月", localLocale);
                break;
            }
            paramContext = new SimpleDateFormat("d MMM", localLocale);
            break;
            if (localLocale.getLanguage().toLowerCase().equals("zh"))
            {
                paramContext = new SimpleDateFormat("MM月dd日", localLocale);
                break;
            }
            paramContext = new SimpleDateFormat("MMM d", localLocale);
            break;
            paramContext = u.c(paramContext, localLocale);
            break;
            if (paramLocale.contains("helmikuuta")) {
                return paramLocale.replace("helmikuuta", "hel");
            }
            if (paramLocale.contains("maaliskuuta")) {
                return paramLocale.replace("maaliskuuta", "maa");
            }
            if (paramLocale.contains("huhtikuuta")) {
                return paramLocale.replace("huhtikuuta", "huh");
            }
            if (paramLocale.contains("toukokuuta")) {
                return paramLocale.replace("toukokuuta", "tou");
            }
            if (paramLocale.contains("kesäkuuta")) {
                return paramLocale.replace("kesäkuuta", "kes");
            }
            if (paramLocale.contains("heinäkuuta")) {
                return paramLocale.replace("heinäkuuta", "hei");
            }
            if (paramLocale.contains("elokuuta")) {
                return paramLocale.replace("elokuuta", "elo");
            }
            if (paramLocale.contains("syyskuuta")) {
                return paramLocale.replace("syyskuuta", "syy");
            }
            if (paramLocale.contains("lokakuuta")) {
                return paramLocale.replace("lokakuuta", "lok");
            }
            if (paramLocale.contains("marraskuuta")) {
                return paramLocale.replace("marraskuuta", "mar");
            }
            paramContext = paramLocale;
        } while (!paramLocale.contains("joulukuuta"));
        return paramLocale.replace("joulukuuta", "jou");
    }

    public ArrayList<PeriodCompat> b(Context paramContext, long paramLong1, long paramLong2)
    {
        paramContext = new ArrayList();
        int i = 0;
        while (i < a.a.size())
        {
            if (((PeriodCompat)a.a.get(i)).getMenses_start() <= paramLong2)
            {
                if (((PeriodCompat)a.a.get(i)).getMenses_start() >= paramLong1) {
                    paramContext.add(a.a.get(i));
                }
            }
            else
            {
                i += 1;
                continue;
            }
            if (b(((PeriodCompat)a.a.get(i)).getMenses_start(), Math.abs(((PeriodCompat)a.a.get(i)).a(true))) >= paramLong1) {
                paramContext.add(a.a.get(i));
            }
        }
        return paramContext;
    }

    public LinkedHashMap<Integer, String> b(Context paramContext, String paramString)
    {
        paramString = new LinkedHashMap();
        Object localObject1 = new g(paramContext).a();
        Object localObject2 = ((LinkedHashMap)localObject1).keySet().iterator();
        Object localObject3;
        while (((Iterator)localObject2).hasNext())
        {
            localObject3 = (Integer)((Iterator)localObject2).next();
            paramString.put(localObject3, paramContext.getResources().getString(((Integer)((HashMap)((LinkedHashMap)localObject1).get(localObject3)).get("name")).intValue()));
        }
        localObject1 = a.am(paramContext);
        if (!((String)localObject1).equals("")) {
            try
            {
                localObject1 = new JSONObject((String)localObject1).getJSONArray("symp_rename_list");
                int i = 0;
                while (i < ((JSONArray)localObject1).length())
                {
                    localObject2 = ((JSONArray)localObject1).getJSONObject(i);
                    localObject3 = paramString.keySet().iterator();
                    while (((Iterator)localObject3).hasNext())
                    {
                        Integer localInteger = (Integer)((Iterator)localObject3).next();
                        if (((JSONObject)localObject2).has(localInteger + "")) {
                            paramString.put(localInteger, (String)((JSONObject)localObject2).get(localInteger + ""));
                        }
                    }
                    i += 1;
                }
                return paramString;
            }
            catch (JSONException localJSONException)
            {
                r.a().a(paramContext, "DataUtils", 3, localJSONException, "");
                localJSONException.printStackTrace();
            }
        }
    }

    public boolean b(Context paramContext, f paramf)
    {
        if (paramf.a(paramContext, 0) == null)
        {
            UserCompat localUserCompat = new UserCompat();
            localUserCompat.setUid(0);
            localUserCompat.setUsername(paramContext.getResources().getString(2131165370));
            return paramf.a(paramContext, localUserCompat);
        }
        return true;
    }

    public boolean b(Context paramContext, f paramf, long paramLong)
    {
        int j = a.a.size();
        int i = 0;
        PeriodCompat localPeriodCompat;
        if (i < j)
        {
            localPeriodCompat = (PeriodCompat)a.a.get(i);
            if (paramLong >= localPeriodCompat.getMenses_start())
            {
                ((PeriodCompat)a.a.get(i)).setMenses_length(-a.N(paramContext));
                i = a.d.a(paramContext);
                if (i == 0)
                {
                    i = Integer.MIN_VALUE;
                    label79:
                    localPeriodCompat.setMenses_length(i);
                }
            }
        }
        for (boolean bool = paramf.b(paramContext, localPeriodCompat);; bool = false)
        {
            if (bool) {
                d.a().a(paramContext, true);
            }
            return bool;
            i = -i;
            break label79;
            i += 1;
            break;
        }
    }

    public boolean b(Context paramContext, f paramf, PeriodCompat paramPeriodCompat)
    {
        if (a.a.size() <= 0) {
            return false;
        }
        boolean bool;
        if (paramPeriodCompat.getMenses_start() == ((PeriodCompat)a.a.get(0)).getMenses_start())
        {
            a.a.remove(0);
            paramf.a(paramContext, paramPeriodCompat.f());
            bool = true;
        }
        for (;;)
        {
            if ((a.a.size() > 0) && (!((PeriodCompat)a.a.get(0)).isPregnancy()))
            {
                ((PeriodCompat)a.a.get(0)).setPeriod_length(b(paramContext, (PeriodCompat)a.a.get(0)));
                paramf.b(paramContext, (PeriodCompat)a.a.get(0));
            }
            if (bool) {
                d.a().a(paramContext, true);
            }
            for (;;)
            {
                return bool;
                if (paramPeriodCompat.getMenses_start() == ((PeriodCompat)a.a.get(a.a.size() - 1)).getMenses_start())
                {
                    paramf.a(paramContext, paramPeriodCompat.f());
                    a.a.remove(a.a.size() - 1);
                    bool = true;
                    break;
                }
                int j = a.a.size();
                int i = 1;
                for (;;)
                {
                    if (i >= j - 1) {
                        break label384;
                    }
                    if (paramPeriodCompat.getMenses_start() == ((PeriodCompat)a.a.get(i)).getMenses_start())
                    {
                        if (!((PeriodCompat)a.a.get(i + 1)).isPregnancy())
                        {
                            ((PeriodCompat)a.a.get(i + 1)).setPeriod_length(a(((PeriodCompat)a.a.get(i + 1)).getMenses_start(), ((PeriodCompat)a.a.get(i - 1)).getMenses_start()));
                            paramf.b(paramContext, (PeriodCompat)a.a.get(i + 1));
                        }
                        if (!paramf.a(paramContext, paramPeriodCompat.f())) {
                            break label384;
                        }
                        a.a.remove(i);
                        bool = true;
                        break;
                    }
                    i += 1;
                }
                r.a().a(paramContext, "经期相关问题", "无法删除经期", "", null);
            }
            label384:
            bool = false;
        }
    }

    public int c(int paramInt1, int paramInt2)
    {
        int[] arrayOfInt = new int[12];
        int[] tmp6_5 = arrayOfInt;
        tmp6_5[0] = 31;
        int[] tmp11_6 = tmp6_5;
        tmp11_6[1] = 28;
        int[] tmp16_11 = tmp11_6;
        tmp16_11[2] = 31;
        int[] tmp21_16 = tmp16_11;
        tmp21_16[3] = 30;
        int[] tmp26_21 = tmp21_16;
        tmp26_21[4] = 31;
        int[] tmp31_26 = tmp26_21;
        tmp31_26[5] = 30;
        int[] tmp36_31 = tmp31_26;
        tmp36_31[6] = 31;
        int[] tmp42_36 = tmp36_31;
        tmp42_36[7] = 31;
        int[] tmp48_42 = tmp42_36;
        tmp48_42[8] = 30;
        int[] tmp54_48 = tmp48_42;
        tmp54_48[9] = 31;
        int[] tmp60_54 = tmp54_48;
        tmp60_54[10] = 30;
        int[] tmp66_60 = tmp60_54;
        tmp66_60[11] = 31;
        tmp66_60;
        if (paramInt2 == 1)
        {
            if (((paramInt1 % 4 == 0) && (paramInt1 % 100 != 0)) || (paramInt1 % 400 == 0)) {
                return arrayOfInt[paramInt2] + 1;
            }
            return arrayOfInt[paramInt2];
        }
        return arrayOfInt[paramInt2];
    }

    public int c(Context paramContext, f paramf, PeriodCompat paramPeriodCompat)
    {
        label101:
        for (;;)
        {
            try
            {
                a.O(paramContext);
                if ((paramPeriodCompat != null) && (a.a != null) && (a.a.size() > 0) && (a.a.get(0) != null))
                {
                    if (paramPeriodCompat.getMenses_start() > ((PeriodCompat)a.a.get(0)).getMenses_start())
                    {
                        break label101;
                        if (i == 0)
                        {
                            i = d(paramContext, paramf, paramPeriodCompat);
                            return i;
                        }
                    }
                    else
                    {
                        i = 0;
                        continue;
                    }
                    i = a(paramContext, paramf);
                    continue;
                }
                int i = 1;
            }
            finally {}
        }
    }

    public long c(long paramLong)
    {
        return a(a(paramLong));
    }

    public long c(long paramLong, int paramInt)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.add(11, paramInt);
        paramLong = localCalendar.getTimeInMillis();
        localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.set(11, 0);
        localCalendar.set(12, 0);
        localCalendar.set(13, 0);
        localCalendar.set(14, 0);
        return localCalendar.getTimeInMillis();
    }

    public Cell c(Context paramContext, f paramf, long paramLong)
    {
        return a(paramContext, paramf, paramLong, false);
    }

    public PeriodCompat c(Context paramContext, long paramLong)
    {
        ArrayList localArrayList = a.a();
        if (localArrayList.size() <= 0) {
            return null;
        }
        PeriodCompat localPeriodCompat = (PeriodCompat)a.a.get(0);
        long l1 = 0L;
        if (localPeriodCompat.getPeriod_length() != 0) {
            l1 = (paramLong - localPeriodCompat.getMenses_start()) / (localPeriodCompat.getPeriod_length() * 24L * 60L * 60L * 1000L) + 1L;
        }
        int j;
        int i;
        if (l1 > 0L)
        {
            j = -a.d.a(paramContext);
            i = 0;
            while (i < l1)
            {
                paramContext = new PeriodCompat();
                paramContext.setMenses_start(b(((PeriodCompat)localArrayList.get(0)).getMenses_start(), ((PeriodCompat)localArrayList.get(0)).getPeriod_length()));
                paramContext.setMenses_length(j);
                paramContext.setPeriod_length(((PeriodCompat)localArrayList.get(0)).getPeriod_length());
                localArrayList.add(0, paramContext);
                i += 1;
            }
        }
        if (paramLong < c(((PeriodCompat)localArrayList.get(localArrayList.size() - 1)).getMenses_start())) {
            return (PeriodCompat)localArrayList.get(localArrayList.size() - 1);
        }
        if (localArrayList.size() > 2)
        {
            if (paramLong >= c(((PeriodCompat)localArrayList.get(0)).getMenses_start())) {
                return (PeriodCompat)localArrayList.get(0);
            }
            j = localArrayList.size() - 1;
            i = 1;
            if (j >= i)
            {
                int k = (j + i) / 2;
                l1 = c(((PeriodCompat)localArrayList.get(k)).getMenses_start());
                long l2 = c(((PeriodCompat)localArrayList.get(k - 1)).getMenses_start());
                if ((paramLong >= l1) && (paramLong < l2)) {
                    return (PeriodCompat)localArrayList.get(k - 1);
                }
                if (paramLong >= l2) {
                    j = k - 1;
                }
                for (;;)
                {
                    break;
                    i = k + 1;
                }
            }
        }
        else
        {
            return (PeriodCompat)localArrayList.get(0);
        }
        return null;
    }

    public String c(Context paramContext, long paramLong, Locale paramLocale)
    {
        Locale localLocale = paramLocale;
        if (a.b(paramLocale)) {
            localLocale = Locale.ENGLISH;
        }
        paramLocale = null;
        Date localDate = new Date();
        localDate.setTime(paramLong);
        switch (a.m(paramContext))
        {
            default:
                paramContext = paramLocale;
        }
        for (;;)
        {
            return paramContext.format(localDate);
            paramContext = new SimpleDateFormat("MM/yyyy", localLocale);
            continue;
            paramContext = new SimpleDateFormat("MM/yyyy", localLocale);
            continue;
            paramContext = new SimpleDateFormat("yyyy/MM", localLocale);
            continue;
            paramContext = new SimpleDateFormat("MM yyyy", localLocale);
            continue;
            paramContext = new SimpleDateFormat("yyyy MM", localLocale);
            continue;
            paramContext = new SimpleDateFormat("yyyy-MM", localLocale);
            continue;
            paramContext = new SimpleDateFormat("MMM, yyyy", localLocale);
            continue;
            paramContext = new SimpleDateFormat("MMM, yyyy", localLocale);
            continue;
            if (localLocale.getLanguage().toLowerCase().equals("zh"))
            {
                paramContext = new SimpleDateFormat("yyyy年MM月", localLocale);
            }
            else
            {
                paramContext = new SimpleDateFormat("yyyy MMM", localLocale);
                continue;
                paramContext = u.b(paramContext, localLocale);
            }
        }
    }

    public ArrayList<Integer> c(Context paramContext, PeriodCompat paramPeriodCompat)
    {
        int m = 1;
        int k = -1;
        int i = a.d.c(paramContext, a.b, paramPeriodCompat);
        int n = Math.abs(i);
        int j = paramPeriodCompat.getPeriod_length();
        int i3 = Math.abs(paramPeriodCompat.a(true));
        n = j - n;
        label114:
        int i1;
        int i2;
        if ((j >= 21) && (n >= i3 + 1)) {
            if (i > 0)
            {
                i = n + 1;
                long l = a.d.b(paramPeriodCompat.getMenses_start(), n + 1);
                if (l > a.d.b(paramPeriodCompat.getMenses_start(), j - 1))
                {
                    j = n + 1;
                    n = i;
                    i1 = k;
                    i2 = j;
                    if (m < 7)
                    {
                        if (a.d.b(l, -m) > a.d.b(paramPeriodCompat.getMenses_start(), i3)) {
                            break label222;
                        }
                        i2 = j;
                        i1 = k;
                        n = i;
                    }
                }
            }
        }
        for (;;)
        {
            paramContext = new ArrayList();
            paramContext.add(Integer.valueOf(i1));
            paramContext.add(Integer.valueOf(n));
            paramContext.add(Integer.valueOf(i2));
            return paramContext;
            j = n + 2;
            m = 0;
            break label114;
            label222:
            k = j - m;
            m += 1;
            break label114;
            i = -1;
            break;
            i2 = -1;
            n = -1;
            i1 = k;
        }
    }

    public int d(Context paramContext, f paramf, PeriodCompat paramPeriodCompat)
    {
        for (;;)
        {
            int n;
            int m;
            try
            {
                n = a.O(paramContext);
                long l1 = paramPeriodCompat.getMenses_start();
                long l2 = b(paramPeriodCompat.getMenses_start(), paramPeriodCompat.getPeriod_length());
                ArrayList localArrayList = paramf.b(paramContext, l1, l2 - 86400000L);
                int i1 = Integer.MAX_VALUE;
                long l3 = b(l1, paramPeriodCompat.getPeriod_length() - n);
                int j = -1;
                int i2 = 0;
                i = 0;
                m = i2;
                int k = j;
                if (localArrayList == null) {
                    break label454;
                }
                m = i2;
                k = j;
                if (localArrayList.size() <= 0) {
                    break label454;
                }
                m = 0;
                k = i1;
                if (m < localArrayList.size())
                {
                    if (((NoteCompat)localArrayList.get(m)).f() < 0)
                    {
                        if (!a(((NoteCompat)localArrayList.get(m)).getDate()).equals(a(l3))) {
                            break label461;
                        }
                        i = 1;
                        break label461;
                    }
                    i1 = Math.abs(a(l3, ((NoteCompat)localArrayList.get(m)).getDate()));
                    if (i1 >= k) {
                        break label461;
                    }
                    k = i1;
                    j = m;
                    break label461;
                }
                if (j >= 0)
                {
                    n = a(((NoteCompat)localArrayList.get(j)).getDate(), l2);
                    m = i;
                    k = j;
                    i = n;
                    j = i;
                    if (localArrayList == null) {
                        break label447;
                    }
                    j = i;
                    if (k != -1) {
                        break label447;
                    }
                    j = i;
                    if (m != 0) {
                        break label447;
                    }
                    j = i;
                    if (paramPeriodCompat.getMenses_start() != ((PeriodCompat)a.a.get(0)).getMenses_start()) {
                        break label447;
                    }
                    k = a(paramContext, paramf);
                    l1 = b(l1, paramPeriodCompat.getPeriod_length() - k);
                    i = 0;
                    j = k;
                    if (i >= localArrayList.size()) {
                        break label447;
                    }
                    if (((NoteCompat)localArrayList.get(i)).f() < 0)
                    {
                        boolean bool = a(((NoteCompat)localArrayList.get(i)).getDate()).equals(a(l1));
                        if (bool)
                        {
                            i = -k;
                            return i;
                        }
                    }
                }
                else
                {
                    m = i;
                    k = j;
                    if (i == 0) {
                        break label454;
                    }
                    k = -n;
                    m = i;
                    i = k;
                    k = j;
                    continue;
                }
                i += 1;
                continue;
                i = j;
            }
            finally {}
            label447:
            continue;
            label454:
            int i = n;
            continue;
            label461:
            m += 1;
        }
    }

    public long d(long paramLong)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.add(1, -1);
        localCalendar.set(2, 11);
        localCalendar.set(5, 1);
        localCalendar.set(11, 0);
        localCalendar.set(12, 0);
        localCalendar.set(13, 0);
        localCalendar.set(14, 0);
        return localCalendar.getTimeInMillis();
    }

    public PeriodCompat d(Context paramContext, long paramLong)
    {
        paramContext = a.a;
        if (paramContext.size() <= 0) {
            return null;
        }
        int m = -1;
        int j = Integer.MAX_VALUE;
        int i = 0;
        while (i < paramContext.size())
        {
            int n = Math.abs(a(((PeriodCompat)paramContext.get(i)).getMenses_start(), paramLong));
            int k = j;
            if (n < j)
            {
                m = i;
                k = n;
            }
            i += 1;
            j = k;
        }
        if (m != -1) {
            return (PeriodCompat)paramContext.get(m);
        }
        return null;
    }

    public String d(Context paramContext, long paramLong, Locale paramLocale)
    {
        paramLocale = Calendar.getInstance();
        paramLocale.setTimeInMillis(paramLong);
        switch (paramLocale.get(7))
        {
            default:
                return "";
            case 1:
                return paramContext.getString(2131165906);
            case 2:
                return paramContext.getString(2131165622);
            case 3:
                return paramContext.getString(2131166004);
            case 4:
                return paramContext.getString(2131166030);
            case 5:
                return paramContext.getString(2131165995);
            case 6:
                return paramContext.getString(2131165443);
        }
        return paramContext.getString(2131165823);
    }

    public LinkedHashMap<Double, Double> d(Context paramContext, f paramf, long paramLong)
    {
        LinkedHashMap localLinkedHashMap = new LinkedHashMap();
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        long l = f(paramLong);
        paramLong = g(paramLong);
        int i = localCalendar.get(1);
        paramContext = paramf.a(paramContext, l - 86400000L, paramLong + 86400000L);
        paramf = paramContext.keySet().iterator();
        while (paramf.hasNext())
        {
            NoteCompat localNoteCompat = (NoteCompat)paramContext.get(paramf.next());
            localCalendar.setTimeInMillis(localNoteCompat.getDate());
            if (i == localCalendar.get(1)) {
                localLinkedHashMap.put(Double.valueOf(a(a(localNoteCompat.getDate()))), Double.valueOf(localNoteCompat.getWeight()));
            }
        }
        return localLinkedHashMap;
    }

    public long e(long paramLong)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.add(1, 1);
        localCalendar.set(2, 0);
        localCalendar.set(5, 1);
        localCalendar.set(11, 0);
        localCalendar.set(12, 0);
        localCalendar.set(13, 0);
        localCalendar.set(14, 0);
        return localCalendar.getTimeInMillis();
    }

    public String e(Context paramContext, long paramLong, Locale paramLocale)
    {
        Locale localLocale = paramLocale;
        if (a.b(paramLocale)) {
            localLocale = Locale.ENGLISH;
        }
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("EEE", localLocale);
        String str = localSimpleDateFormat.format(Long.valueOf(paramLong));
        paramLocale = str;
        if (Pattern.compile("[1-7]").matcher(localSimpleDateFormat.format(Long.valueOf(paramLong))).matches()) {
            switch (Integer.parseInt(str))
            {
                default:
                    paramLocale = str;
            }
        }
        for (;;)
        {
            paramContext = paramLocale;
            if (localLocale.getLanguage().toLowerCase().equals("es")) {
                paramContext = paramLocale.replace(".", "");
            }
            return paramContext;
            paramLocale = paramContext.getString(2131165907);
            continue;
            paramLocale = paramContext.getString(2131165623);
            continue;
            paramLocale = paramContext.getString(2131166005);
            continue;
            paramLocale = paramContext.getString(2131166031);
            continue;
            paramLocale = paramContext.getString(2131165996);
            continue;
            paramLocale = paramContext.getString(2131165444);
            continue;
            paramLocale = paramContext.getString(2131165824);
        }
    }

    public LinkedHashMap<Double, Double> e(Context paramContext, f paramf, long paramLong)
    {
        LinkedHashMap localLinkedHashMap = new LinkedHashMap();
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        long l = f(paramLong);
        paramLong = g(paramLong);
        int i = localCalendar.get(1);
        paramContext = paramf.a(paramContext, l - 86400000L, paramLong + 86400000L);
        paramf = paramContext.keySet().iterator();
        while (paramf.hasNext())
        {
            NoteCompat localNoteCompat = (NoteCompat)paramContext.get(paramf.next());
            localCalendar.setTimeInMillis(localNoteCompat.getDate());
            if (i == localCalendar.get(1)) {
                localLinkedHashMap.put(Double.valueOf(a(a(localNoteCompat.getDate()))), Double.valueOf(localNoteCompat.getTemperature()));
            }
        }
        return localLinkedHashMap;
    }

    public long f(long paramLong)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.set(2, 0);
        localCalendar.set(5, 1);
        localCalendar.set(11, 0);
        localCalendar.set(12, 0);
        localCalendar.set(13, 0);
        localCalendar.set(14, 0);
        return localCalendar.getTimeInMillis();
    }

    public String f(Context paramContext, long paramLong, Locale paramLocale)
    {
        if (paramLocale.getLanguage().equals("ko"))
        {
            if (a.m(paramContext) == 9)
            {
                paramContext = new Date();
                paramContext.setTime(paramLong);
                return new SimpleDateFormat("yyyy년 MM월 dd일 EEEE", paramLocale).format(paramContext);
            }
            return a(paramContext, paramLong, paramLocale) + ", " + e(paramContext, paramLong, paramLocale);
        }
        if ((paramLocale.getLanguage().equals("fr")) || (paramLocale.getLanguage().equals("de"))) {
            return e(paramContext, paramLong, paramLocale) + " " + a(paramContext, paramLong, paramLocale);
        }
        return e(paramContext, paramLong, paramLocale) + ", " + a(paramContext, paramLong, paramLocale);
    }

    public LinkedHashMap<Double, Double> f(Context paramContext, f paramf, long paramLong)
    {
        LinkedHashMap localLinkedHashMap = new LinkedHashMap();
        Calendar localCalendar = Calendar.getInstance();
        paramContext = paramf.a(paramContext, l(paramLong) - 86400000L, i(j(paramLong)) + 86400000L);
        paramf = paramContext.keySet().iterator();
        while (paramf.hasNext())
        {
            NoteCompat localNoteCompat = (NoteCompat)paramContext.get(paramf.next());
            localCalendar.setTimeInMillis(localNoteCompat.getDate());
            localLinkedHashMap.put(Double.valueOf(a(a(localNoteCompat.getDate()))), Double.valueOf(localNoteCompat.getWeight()));
        }
        return localLinkedHashMap;
    }

    public long g(long paramLong)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.set(2, 11);
        localCalendar.set(5, 31);
        localCalendar.set(11, 0);
        localCalendar.set(12, 0);
        localCalendar.set(13, 0);
        localCalendar.set(14, 0);
        return localCalendar.getTimeInMillis();
    }

    public String g(Context paramContext, long paramLong, Locale paramLocale)
    {
        Locale localLocale = paramLocale;
        if (a.b(paramLocale)) {
            localLocale = Locale.ENGLISH;
        }
        paramLocale = new SimpleDateFormat("HH:mm", localLocale);
        Date localDate = new Date();
        localDate.setTime(paramLong);
        return a(paramContext, paramLong, localLocale) + " " + paramLocale.format(localDate);
    }

    public LinkedHashMap<Double, Double> g(Context paramContext, f paramf, long paramLong)
    {
        LinkedHashMap localLinkedHashMap = new LinkedHashMap();
        Calendar localCalendar = Calendar.getInstance();
        paramContext = paramf.a(paramContext, l(paramLong) - 86400000L, i(j(paramLong)) + 86400000L);
        paramf = paramContext.keySet().iterator();
        while (paramf.hasNext())
        {
            NoteCompat localNoteCompat = (NoteCompat)paramContext.get(paramf.next());
            localCalendar.setTimeInMillis(localNoteCompat.getDate());
            localLinkedHashMap.put(Double.valueOf(a(a(localNoteCompat.getDate()))), Double.valueOf(localNoteCompat.getTemperature()));
        }
        return localLinkedHashMap;
    }

    public long h(long paramLong)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.set(5, 1);
        localCalendar.set(11, 0);
        localCalendar.set(12, 0);
        localCalendar.set(13, 0);
        localCalendar.set(14, 0);
        return localCalendar.getTimeInMillis();
    }

    public LinkedHashMap<Double, Double> h(Context paramContext, f paramf, long paramLong)
    {
        LinkedHashMap localLinkedHashMap = new LinkedHashMap();
        Calendar localCalendar = Calendar.getInstance();
        switch (a.l(paramContext))
        {
        }
        for (;;)
        {
            localCalendar.setTimeInMillis(paramLong);
            int i = localCalendar.get(3);
            long l = a(paramLong, paramContext);
            localCalendar.setTimeInMillis(paramLong);
            paramf = paramf.a(paramContext, l - 86400000L, b(l, 7));
            Iterator localIterator = paramf.keySet().iterator();
            while (localIterator.hasNext())
            {
                NoteCompat localNoteCompat = (NoteCompat)paramf.get(localIterator.next());
                localCalendar.setTimeInMillis(localNoteCompat.getDate());
                if (i == localCalendar.get(3)) {
                    localLinkedHashMap.put(Double.valueOf(a(localCalendar.get(7), paramContext)), Double.valueOf(localNoteCompat.getWeight()));
                }
            }
            localCalendar.setFirstDayOfWeek(1);
            continue;
            localCalendar.setFirstDayOfWeek(2);
            continue;
            localCalendar.setFirstDayOfWeek(7);
        }
        return localLinkedHashMap;
    }

    public long i(long paramLong)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.set(5, c(localCalendar.get(1), localCalendar.get(2)));
        return localCalendar.getTimeInMillis();
    }

    public LinkedHashMap<Double, Double> i(Context paramContext, f paramf, long paramLong)
    {
        LinkedHashMap localLinkedHashMap = new LinkedHashMap();
        Calendar localCalendar = Calendar.getInstance();
        switch (a.l(paramContext))
        {
        }
        for (;;)
        {
            localCalendar.setTimeInMillis(paramLong);
            int i = localCalendar.get(3);
            long l = a(paramLong, paramContext);
            localCalendar.setTimeInMillis(paramLong);
            paramf = paramf.a(paramContext, l - 86400000L, b(l, 7));
            Iterator localIterator = paramf.keySet().iterator();
            while (localIterator.hasNext())
            {
                NoteCompat localNoteCompat = (NoteCompat)paramf.get(localIterator.next());
                localCalendar.setTimeInMillis(localNoteCompat.getDate());
                if (i == localCalendar.get(3)) {
                    localLinkedHashMap.put(Double.valueOf(a(localCalendar.get(7), paramContext)), Double.valueOf(localNoteCompat.getTemperature()));
                }
            }
            localCalendar.setFirstDayOfWeek(1);
            continue;
            localCalendar.setFirstDayOfWeek(2);
            continue;
            localCalendar.setFirstDayOfWeek(7);
        }
        return localLinkedHashMap;
    }

    public long j(long paramLong)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.add(2, 1);
        localCalendar.set(5, 1);
        localCalendar.set(11, 0);
        localCalendar.set(12, 0);
        localCalendar.set(13, 0);
        localCalendar.set(14, 0);
        return localCalendar.getTimeInMillis();
    }

    public long k(long paramLong)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.add(2, -1);
        localCalendar.set(5, 1);
        localCalendar.set(11, 0);
        localCalendar.set(12, 0);
        localCalendar.set(13, 0);
        localCalendar.set(14, 0);
        return localCalendar.getTimeInMillis();
    }

    public long l(long paramLong)
    {
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.setTimeInMillis(paramLong);
        localCalendar.add(2, -10);
        localCalendar.set(5, localCalendar.getActualMinimum(5));
        return localCalendar.getTimeInMillis();
    }
}