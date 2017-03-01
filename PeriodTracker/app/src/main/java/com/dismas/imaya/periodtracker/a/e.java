package com.dismas.imaya.periodtracker.a;

import android.content.Context;
import android.database.Cursor;

/**
 * Created by imaya on 1/30/17.
 */

public class e
{
    /* Error */
    public int a(Context paramContext, int paramInt)
    {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: ldc 15
        //   4: astore 6
        //   6: iload_2
        //   7: iflt +24 -> 31
        //   10: new 17	java/lang/StringBuilder
        //   13: dup
        //   14: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   17: ldc 20
        //   19: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   22: iload_2
        //   23: invokevirtual 27	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   26: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   29: astore 6
        //   31: new 33	com/popularapp/periodcalendar/a/d
        //   34: dup
        //   35: aload_1
        //   36: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   39: astore 4
        //   41: aload 4
        //   43: invokevirtual 40	com/popularapp/periodcalendar/a/d:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   46: astore 5
        //   48: aload 5
        //   50: new 17	java/lang/StringBuilder
        //   53: dup
        //   54: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   57: ldc 42
        //   59: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   62: aload 6
        //   64: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   67: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   70: aconst_null
        //   71: invokevirtual 48	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   74: astore 6
        //   76: aload 6
        //   78: ifnull +307 -> 385
        //   81: aload 6
        //   83: invokeinterface 54 1 0
        //   88: ifeq +297 -> 385
        //   91: aload 6
        //   93: iconst_0
        //   94: invokeinterface 58 2 0
        //   99: istore_2
        //   100: aload 6
        //   102: ifnull +10 -> 112
        //   105: aload 6
        //   107: invokeinterface 61 1 0
        //   112: aload 5
        //   114: ifnull +8 -> 122
        //   117: aload 5
        //   119: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   122: iload_2
        //   123: istore_3
        //   124: aload 4
        //   126: ifnull +10 -> 136
        //   129: aload 4
        //   131: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   134: iload_2
        //   135: istore_3
        //   136: aload_0
        //   137: monitorexit
        //   138: iload_3
        //   139: ireturn
        //   140: astore 7
        //   142: aconst_null
        //   143: astore 4
        //   145: aconst_null
        //   146: astore 5
        //   148: aconst_null
        //   149: astore 6
        //   151: aload 7
        //   153: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   156: aload_1
        //   157: instanceof 68
        //   160: ifeq +49 -> 209
        //   163: aload_1
        //   164: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   167: aload 7
        //   169: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   172: aload 4
        //   174: ifnull +10 -> 184
        //   177: aload 4
        //   179: invokeinterface 61 1 0
        //   184: aload 5
        //   186: ifnull +8 -> 194
        //   189: aload 5
        //   191: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   194: aload 6
        //   196: ifnull +8 -> 204
        //   199: aload 6
        //   201: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   204: iconst_0
        //   205: istore_3
        //   206: goto -70 -> 136
        //   209: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   212: aload_1
        //   213: ldc 78
        //   215: iconst_2
        //   216: aload 7
        //   218: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   221: aload_1
        //   222: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   225: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   228: goto -56 -> 172
        //   231: astore_1
        //   232: aload 4
        //   234: ifnull +10 -> 244
        //   237: aload 4
        //   239: invokeinterface 61 1 0
        //   244: aload 5
        //   246: ifnull +8 -> 254
        //   249: aload 5
        //   251: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   254: aload 6
        //   256: ifnull +8 -> 264
        //   259: aload 6
        //   261: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   264: aload_1
        //   265: athrow
        //   266: astore_1
        //   267: aload_0
        //   268: monitorexit
        //   269: aload_1
        //   270: athrow
        //   271: astore_1
        //   272: aconst_null
        //   273: astore 4
        //   275: aconst_null
        //   276: astore 5
        //   278: aconst_null
        //   279: astore 6
        //   281: goto -49 -> 232
        //   284: astore_1
        //   285: aconst_null
        //   286: astore 7
        //   288: aconst_null
        //   289: astore 5
        //   291: aload 4
        //   293: astore 6
        //   295: aload 7
        //   297: astore 4
        //   299: goto -67 -> 232
        //   302: astore_1
        //   303: aconst_null
        //   304: astore 7
        //   306: aload 4
        //   308: astore 6
        //   310: aload 7
        //   312: astore 4
        //   314: goto -82 -> 232
        //   317: astore_1
        //   318: aload 6
        //   320: astore 7
        //   322: aload 4
        //   324: astore 6
        //   326: aload 7
        //   328: astore 4
        //   330: goto -98 -> 232
        //   333: astore 7
        //   335: aconst_null
        //   336: astore 8
        //   338: aconst_null
        //   339: astore 5
        //   341: aload 4
        //   343: astore 6
        //   345: aload 8
        //   347: astore 4
        //   349: goto -198 -> 151
        //   352: astore 7
        //   354: aconst_null
        //   355: astore 8
        //   357: aload 4
        //   359: astore 6
        //   361: aload 8
        //   363: astore 4
        //   365: goto -214 -> 151
        //   368: astore 7
        //   370: aload 4
        //   372: astore 8
        //   374: aload 6
        //   376: astore 4
        //   378: aload 8
        //   380: astore 6
        //   382: goto -231 -> 151
        //   385: iconst_0
        //   386: istore_2
        //   387: goto -287 -> 100
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	390	0	this	e
        //   0	390	1	paramContext	Context
        //   0	390	2	paramInt	int
        //   123	83	3	i	int
        //   39	338	4	localObject1	Object
        //   46	294	5	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
        //   4	377	6	localObject2	Object
        //   140	77	7	localException1	Exception
        //   286	41	7	localObject3	Object
        //   333	1	7	localException2	Exception
        //   352	1	7	localException3	Exception
        //   368	1	7	localException4	Exception
        //   336	43	8	localObject4	Object
        // Exception table:
        //   from	to	target	type
        //   31	41	140	java/lang/Exception
        //   151	172	231	finally
        //   209	228	231	finally
        //   10	31	266	finally
        //   105	112	266	finally
        //   117	122	266	finally
        //   129	134	266	finally
        //   177	184	266	finally
        //   189	194	266	finally
        //   199	204	266	finally
        //   237	244	266	finally
        //   249	254	266	finally
        //   259	264	266	finally
        //   264	266	266	finally
        //   31	41	271	finally
        //   41	48	284	finally
        //   48	76	302	finally
        //   81	100	317	finally
        //   41	48	333	java/lang/Exception
        //   48	76	352	java/lang/Exception
        //   81	100	368	java/lang/Exception
    }

    /* Error */
    public long a(Context paramContext, Pill paramPill)
    {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: new 33	com/popularapp/periodcalendar/a/d
        //   5: dup
        //   6: aload_1
        //   7: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   10: astore 5
        //   12: aload 5
        //   14: invokevirtual 93	com/popularapp/periodcalendar/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   17: astore 6
        //   19: new 95	android/content/ContentValues
        //   22: dup
        //   23: invokespecial 96	android/content/ContentValues:<init>	()V
        //   26: astore 7
        //   28: aload 7
        //   30: ldc 98
        //   32: aload_2
        //   33: invokevirtual 104	com/popularapp/periodcalendar/pill/Pill:e	()J
        //   36: invokestatic 110	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   39: invokevirtual 114	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
        //   42: aload 7
        //   44: ldc 116
        //   46: aload_2
        //   47: invokevirtual 119	com/popularapp/periodcalendar/pill/Pill:f	()Ljava/lang/String;
        //   50: invokevirtual 122	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
        //   53: aload 7
        //   55: ldc 124
        //   57: aload_2
        //   58: invokevirtual 127	com/popularapp/periodcalendar/pill/Pill:g	()J
        //   61: invokestatic 110	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   64: invokevirtual 114	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
        //   67: aload 7
        //   69: ldc -127
        //   71: aload_2
        //   72: invokevirtual 133	com/popularapp/periodcalendar/pill/Pill:q	()I
        //   75: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   78: invokevirtual 141	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
        //   81: aload 7
        //   83: ldc -113
        //   85: aload_2
        //   86: invokevirtual 146	com/popularapp/periodcalendar/pill/Pill:n	()I
        //   89: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   92: invokevirtual 141	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
        //   95: aload 6
        //   97: ldc -108
        //   99: aconst_null
        //   100: aload 7
        //   102: invokevirtual 152	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   105: lstore_3
        //   106: aload 6
        //   108: ifnull +8 -> 116
        //   111: aload 6
        //   113: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   116: aload 5
        //   118: ifnull +212 -> 330
        //   121: aload 5
        //   123: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   126: goto +204 -> 330
        //   129: aload_2
        //   130: invokevirtual 133	com/popularapp/periodcalendar/pill/Pill:q	()I
        //   133: iconst_1
        //   134: if_icmpne +19 -> 153
        //   137: aload_2
        //   138: invokevirtual 155	com/popularapp/periodcalendar/pill/Pill:i	()I
        //   141: iconst_1
        //   142: if_icmpne +11 -> 153
        //   145: invokestatic 160	com/popularapp/periodcalendar/notification/e:a	()Lcom/popularapp/periodcalendar/notification/e;
        //   148: aload_1
        //   149: iconst_1
        //   150: invokevirtual 163	com/popularapp/periodcalendar/notification/e:a	(Landroid/content/Context;Z)V
        //   153: aload_0
        //   154: monitorexit
        //   155: lload_3
        //   156: lreturn
        //   157: astore 7
        //   159: aconst_null
        //   160: astore 5
        //   162: aconst_null
        //   163: astore 6
        //   165: aload 7
        //   167: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   170: aload_1
        //   171: instanceof 68
        //   174: ifeq +37 -> 211
        //   177: aload_1
        //   178: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   181: aload 7
        //   183: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   186: aload 5
        //   188: ifnull +8 -> 196
        //   191: aload 5
        //   193: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   196: aload 6
        //   198: ifnull +8 -> 206
        //   201: aload 6
        //   203: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   206: lconst_0
        //   207: lstore_3
        //   208: goto -79 -> 129
        //   211: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   214: aload_1
        //   215: ldc 78
        //   217: bipush 8
        //   219: aload 7
        //   221: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   224: aload_1
        //   225: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   228: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   231: goto -45 -> 186
        //   234: astore_1
        //   235: aload 6
        //   237: astore_2
        //   238: aload 5
        //   240: ifnull +8 -> 248
        //   243: aload 5
        //   245: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   248: aload_2
        //   249: ifnull +7 -> 256
        //   252: aload_2
        //   253: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   256: aload_1
        //   257: athrow
        //   258: astore_1
        //   259: aload_0
        //   260: monitorexit
        //   261: aload_1
        //   262: athrow
        //   263: astore_1
        //   264: aconst_null
        //   265: astore 5
        //   267: aconst_null
        //   268: astore_2
        //   269: goto -31 -> 238
        //   272: astore_1
        //   273: aconst_null
        //   274: astore 6
        //   276: aload 5
        //   278: astore_2
        //   279: aload 6
        //   281: astore 5
        //   283: goto -45 -> 238
        //   286: astore_1
        //   287: aload 5
        //   289: astore_2
        //   290: aload 6
        //   292: astore 5
        //   294: goto -56 -> 238
        //   297: astore 7
        //   299: aconst_null
        //   300: astore 8
        //   302: aload 5
        //   304: astore 6
        //   306: aload 8
        //   308: astore 5
        //   310: goto -145 -> 165
        //   313: astore 7
        //   315: aload 5
        //   317: astore 8
        //   319: aload 6
        //   321: astore 5
        //   323: aload 8
        //   325: astore 6
        //   327: goto -162 -> 165
        //   330: goto -201 -> 129
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	333	0	this	e
        //   0	333	1	paramContext	Context
        //   0	333	2	paramPill	Pill
        //   105	103	3	l	long
        //   10	312	5	localObject1	Object
        //   17	309	6	localObject2	Object
        //   26	75	7	localContentValues	android.content.ContentValues
        //   157	63	7	localException1	Exception
        //   297	1	7	localException2	Exception
        //   313	1	7	localException3	Exception
        //   300	24	8	localObject3	Object
        // Exception table:
        //   from	to	target	type
        //   2	12	157	java/lang/Exception
        //   165	186	234	finally
        //   211	231	234	finally
        //   111	116	258	finally
        //   121	126	258	finally
        //   129	153	258	finally
        //   191	196	258	finally
        //   201	206	258	finally
        //   243	248	258	finally
        //   252	256	258	finally
        //   256	258	258	finally
        //   2	12	263	finally
        //   12	19	272	finally
        //   19	106	286	finally
        //   12	19	297	java/lang/Exception
        //   19	106	313	java/lang/Exception
    }

    /* Error */
    public Pill a(Context paramContext, long paramLong, boolean paramBoolean)
    {
        // Byte code:
        //   0: aconst_null
        //   1: astore 10
        //   3: aconst_null
        //   4: astore 8
        //   6: aload_0
        //   7: monitorenter
        //   8: new 100	com/popularapp/periodcalendar/pill/Pill
        //   11: dup
        //   12: invokespecial 165	com/popularapp/periodcalendar/pill/Pill:<init>	()V
        //   15: astore 9
        //   17: iload 4
        //   19: ifeq +188 -> 207
        //   22: aload_1
        //   23: invokestatic 168	com/popularapp/periodcalendar/utils/g:a	(Landroid/content/Context;)Ljava/lang/String;
        //   26: astore 5
        //   28: aload 5
        //   30: ldc 15
        //   32: invokevirtual 174	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   35: ifeq +158 -> 193
        //   38: new 33	com/popularapp/periodcalendar/a/d
        //   41: dup
        //   42: aload_1
        //   43: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   46: astore 5
        //   48: aload 5
        //   50: invokevirtual 40	com/popularapp/periodcalendar/a/d:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   53: astore 7
        //   55: aload 5
        //   57: astore 6
        //   59: aload 7
        //   61: astore 5
        //   63: aload 5
        //   65: astore 7
        //   67: aload 6
        //   69: astore 5
        //   71: aload 7
        //   73: astore 6
        //   75: aload 10
        //   77: astore 7
        //   79: aload 6
        //   81: new 17	java/lang/StringBuilder
        //   84: dup
        //   85: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   88: ldc -80
        //   90: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   93: lload_2
        //   94: invokevirtual 179	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   97: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   100: aconst_null
        //   101: invokevirtual 48	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   104: astore 8
        //   106: aload 8
        //   108: ifnull +436 -> 544
        //   111: aload 8
        //   113: astore 7
        //   115: aload 8
        //   117: invokeinterface 54 1 0
        //   122: ifeq +422 -> 544
        //   125: aload 8
        //   127: astore 7
        //   129: aload_0
        //   130: aload 8
        //   132: invokevirtual 182	com/popularapp/periodcalendar/a/e:a	(Landroid/database/Cursor;)Lcom/popularapp/periodcalendar/pill/Pill;
        //   135: astore 10
        //   137: aload 10
        //   139: astore_1
        //   140: aload 8
        //   142: ifnull +20 -> 162
        //   145: aload 8
        //   147: invokeinterface 185 1 0
        //   152: ifne +10 -> 162
        //   155: aload 8
        //   157: invokeinterface 61 1 0
        //   162: aload 6
        //   164: ifnull +8 -> 172
        //   167: aload 6
        //   169: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   172: aload_1
        //   173: astore 6
        //   175: aload 5
        //   177: ifnull +11 -> 188
        //   180: aload 5
        //   182: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   185: aload_1
        //   186: astore 6
        //   188: aload_0
        //   189: monitorexit
        //   190: aload 6
        //   192: areturn
        //   193: aload 5
        //   195: aconst_null
        //   196: invokestatic 189	android/database/sqlite/SQLiteDatabase:openOrCreateDatabase	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;
        //   199: astore 5
        //   201: aconst_null
        //   202: astore 6
        //   204: goto -141 -> 63
        //   207: new 33	com/popularapp/periodcalendar/a/d
        //   210: dup
        //   211: aload_1
        //   212: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   215: astore 5
        //   217: aload 5
        //   219: invokevirtual 40	com/popularapp/periodcalendar/a/d:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   222: astore 6
        //   224: goto -149 -> 75
        //   227: astore 8
        //   229: aconst_null
        //   230: astore 5
        //   232: aconst_null
        //   233: astore 6
        //   235: aconst_null
        //   236: astore 7
        //   238: aload 8
        //   240: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   243: iload 4
        //   245: ifeq +67 -> 312
        //   248: aload_0
        //   249: aload_1
        //   250: lload_2
        //   251: iconst_0
        //   252: invokevirtual 191	com/popularapp/periodcalendar/a/e:a	(Landroid/content/Context;JZ)Lcom/popularapp/periodcalendar/pill/Pill;
        //   255: astore_1
        //   256: aload 5
        //   258: ifnull +20 -> 278
        //   261: aload 5
        //   263: invokeinterface 185 1 0
        //   268: ifne +10 -> 278
        //   271: aload 5
        //   273: invokeinterface 61 1 0
        //   278: aload 6
        //   280: ifnull +8 -> 288
        //   283: aload 6
        //   285: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   288: aload_1
        //   289: astore 6
        //   291: aload 7
        //   293: ifnull -105 -> 188
        //   296: aload 7
        //   298: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   301: aload_1
        //   302: astore 6
        //   304: goto -116 -> 188
        //   307: astore_1
        //   308: aload_0
        //   309: monitorexit
        //   310: aload_1
        //   311: athrow
        //   312: aload_1
        //   313: instanceof 68
        //   316: ifeq +18 -> 334
        //   319: aload_1
        //   320: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   323: aload 8
        //   325: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   328: aload 9
        //   330: astore_1
        //   331: goto -75 -> 256
        //   334: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   337: aload_1
        //   338: ldc 78
        //   340: bipush 6
        //   342: aload 8
        //   344: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   347: aload_1
        //   348: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   351: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   354: aload 9
        //   356: astore_1
        //   357: goto -101 -> 256
        //   360: astore_1
        //   361: aconst_null
        //   362: astore 6
        //   364: aconst_null
        //   365: astore 7
        //   367: aload 8
        //   369: astore 5
        //   371: aload 5
        //   373: ifnull +20 -> 393
        //   376: aload 5
        //   378: invokeinterface 185 1 0
        //   383: ifne +10 -> 393
        //   386: aload 5
        //   388: invokeinterface 61 1 0
        //   393: aload 6
        //   395: ifnull +8 -> 403
        //   398: aload 6
        //   400: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   403: aload 7
        //   405: ifnull +8 -> 413
        //   408: aload 7
        //   410: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   413: aload_1
        //   414: athrow
        //   415: astore_1
        //   416: aconst_null
        //   417: astore 6
        //   419: aload 5
        //   421: astore 7
        //   423: aload 8
        //   425: astore 5
        //   427: goto -56 -> 371
        //   430: astore_1
        //   431: aconst_null
        //   432: astore 6
        //   434: aload 5
        //   436: astore 7
        //   438: aload 8
        //   440: astore 5
        //   442: goto -71 -> 371
        //   445: astore_1
        //   446: aload 5
        //   448: astore 8
        //   450: aload 7
        //   452: astore 5
        //   454: aload 8
        //   456: astore 7
        //   458: goto -87 -> 371
        //   461: astore_1
        //   462: goto -91 -> 371
        //   465: astore 8
        //   467: aconst_null
        //   468: astore 10
        //   470: aconst_null
        //   471: astore 6
        //   473: aload 5
        //   475: astore 7
        //   477: aload 10
        //   479: astore 5
        //   481: goto -243 -> 238
        //   484: astore 8
        //   486: aconst_null
        //   487: astore 10
        //   489: aconst_null
        //   490: astore 6
        //   492: aload 5
        //   494: astore 7
        //   496: aload 10
        //   498: astore 5
        //   500: goto -262 -> 238
        //   503: astore 8
        //   505: aconst_null
        //   506: astore 10
        //   508: aload 5
        //   510: astore 7
        //   512: aload 10
        //   514: astore 5
        //   516: goto -278 -> 238
        //   519: astore 11
        //   521: aload 8
        //   523: astore 7
        //   525: aload 5
        //   527: astore 10
        //   529: aload 11
        //   531: astore 8
        //   533: aload 7
        //   535: astore 5
        //   537: aload 10
        //   539: astore 7
        //   541: goto -303 -> 238
        //   544: aload 9
        //   546: astore_1
        //   547: goto -407 -> 140
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	550	0	this	e
        //   0	550	1	paramContext	Context
        //   0	550	2	paramLong	long
        //   0	550	4	paramBoolean	boolean
        //   26	510	5	localObject1	Object
        //   57	434	6	localObject2	Object
        //   53	487	7	localObject3	Object
        //   4	152	8	localCursor	Cursor
        //   227	212	8	localException1	Exception
        //   448	7	8	localObject4	Object
        //   465	1	8	localException2	Exception
        //   484	1	8	localException3	Exception
        //   503	19	8	localException4	Exception
        //   531	1	8	localObject5	Object
        //   15	530	9	localPill	Pill
        //   1	537	10	localObject6	Object
        //   519	11	11	localException5	Exception
        // Exception table:
        //   from	to	target	type
        //   22	48	227	java/lang/Exception
        //   193	201	227	java/lang/Exception
        //   207	217	227	java/lang/Exception
        //   8	17	307	finally
        //   145	162	307	finally
        //   167	172	307	finally
        //   180	185	307	finally
        //   261	278	307	finally
        //   283	288	307	finally
        //   296	301	307	finally
        //   376	393	307	finally
        //   398	403	307	finally
        //   408	413	307	finally
        //   413	415	307	finally
        //   22	48	360	finally
        //   193	201	360	finally
        //   207	217	360	finally
        //   48	55	415	finally
        //   217	224	430	finally
        //   79	106	445	finally
        //   115	125	445	finally
        //   129	137	445	finally
        //   238	243	461	finally
        //   248	256	461	finally
        //   312	328	461	finally
        //   334	354	461	finally
        //   48	55	465	java/lang/Exception
        //   217	224	484	java/lang/Exception
        //   79	106	503	java/lang/Exception
        //   115	125	519	java/lang/Exception
        //   129	137	519	java/lang/Exception
    }

    public Pill a(Cursor paramCursor)
    {
        try
        {
            Pill localPill = new Pill();
            localPill.a(paramCursor.getLong(paramCursor.getColumnIndexOrThrow("_id")));
            localPill.b(paramCursor.getLong(paramCursor.getColumnIndexOrThrow("uid")));
            localPill.b(paramCursor.getString(paramCursor.getColumnIndexOrThrow("name")));
            localPill.e(paramCursor.getInt(paramCursor.getColumnIndexOrThrow("classify")));
            localPill.c(paramCursor.getLong(paramCursor.getColumnIndexOrThrow("date")));
            localPill.c(paramCursor.getString(paramCursor.getColumnIndexOrThrow("memo")));
            localPill.e(paramCursor.getString(paramCursor.getColumnIndexOrThrow("pill_extension_json")));
            localPill.a(paramCursor.getInt(paramCursor.getColumnIndexOrThrow("notification_switch")));
            localPill.d(paramCursor.getLong(paramCursor.getColumnIndexOrThrow("start_date")));
            localPill.e(paramCursor.getLong(paramCursor.getColumnIndexOrThrow("end_date")));
            localPill.d(paramCursor.getInt(paramCursor.getColumnIndexOrThrow("pill_type")));
            localPill.d(paramCursor.getString(paramCursor.getColumnIndexOrThrow("pill_type_json")));
            return localPill;
        }
        finally
        {
            paramCursor = finally;
            throw paramCursor;
        }
    }

    public ArrayList<Pill> a(Context paramContext, int paramInt, boolean paramBoolean)
    {
        try
        {
            paramContext = a(paramContext, "select * from pill where uid = " + paramInt + " and " + "start_date" + " <= " + System.currentTimeMillis() + " and " + "notification_switch" + " = " + 1 + " and " + "classify" + " = " + 1, paramBoolean);
            return paramContext;
        }
        finally
        {
            paramContext = finally;
            throw paramContext;
        }
    }

    /* Error */
    public ArrayList<Pill> a(Context paramContext, String paramString, boolean paramBoolean)
    {
        // Byte code:
        //   0: aconst_null
        //   1: astore 6
        //   3: aconst_null
        //   4: astore 7
        //   6: aload_0
        //   7: monitorenter
        //   8: new 268	java/util/ArrayList
        //   11: dup
        //   12: invokespecial 269	java/util/ArrayList:<init>	()V
        //   15: astore 8
        //   17: iload_3
        //   18: ifeq +178 -> 196
        //   21: aload_1
        //   22: invokestatic 168	com/popularapp/periodcalendar/utils/g:a	(Landroid/content/Context;)Ljava/lang/String;
        //   25: astore 4
        //   27: aload 4
        //   29: ldc 15
        //   31: invokevirtual 174	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   34: ifeq +148 -> 182
        //   37: new 33	com/popularapp/periodcalendar/a/d
        //   40: dup
        //   41: aload_1
        //   42: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   45: astore 4
        //   47: aload 4
        //   49: invokevirtual 40	com/popularapp/periodcalendar/a/d:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   52: astore 5
        //   54: aload 5
        //   56: aload_2
        //   57: aconst_null
        //   58: invokevirtual 48	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   61: astore 7
        //   63: aload 7
        //   65: ifnull +151 -> 216
        //   68: aload 7
        //   70: astore 6
        //   72: aload 7
        //   74: invokeinterface 54 1 0
        //   79: ifeq +137 -> 216
        //   82: aload 7
        //   84: astore 6
        //   86: aload 8
        //   88: aload_0
        //   89: aload 7
        //   91: invokevirtual 182	com/popularapp/periodcalendar/a/e:a	(Landroid/database/Cursor;)Lcom/popularapp/periodcalendar/pill/Pill;
        //   94: invokevirtual 272	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   97: pop
        //   98: goto -30 -> 68
        //   101: astore 9
        //   103: aload 4
        //   105: astore 6
        //   107: aload 7
        //   109: astore 4
        //   111: aload 9
        //   113: astore 7
        //   115: aload 7
        //   117: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   120: iload_3
        //   121: ifeq +143 -> 264
        //   124: aload_0
        //   125: aload_1
        //   126: aload_2
        //   127: iconst_0
        //   128: invokevirtual 264	com/popularapp/periodcalendar/a/e:a	(Landroid/content/Context;Ljava/lang/String;Z)Ljava/util/ArrayList;
        //   131: astore_1
        //   132: aload 4
        //   134: ifnull +20 -> 154
        //   137: aload 4
        //   139: invokeinterface 185 1 0
        //   144: ifne +10 -> 154
        //   147: aload 4
        //   149: invokeinterface 61 1 0
        //   154: aload 5
        //   156: ifnull +8 -> 164
        //   159: aload 5
        //   161: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   164: aload_1
        //   165: astore_2
        //   166: aload 6
        //   168: ifnull +10 -> 178
        //   171: aload 6
        //   173: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   176: aload_1
        //   177: astore_2
        //   178: aload_0
        //   179: monitorexit
        //   180: aload_2
        //   181: areturn
        //   182: aload 4
        //   184: aconst_null
        //   185: invokestatic 189	android/database/sqlite/SQLiteDatabase:openOrCreateDatabase	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;
        //   188: astore 5
        //   190: aconst_null
        //   191: astore 4
        //   193: goto -139 -> 54
        //   196: new 33	com/popularapp/periodcalendar/a/d
        //   199: dup
        //   200: aload_1
        //   201: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   204: astore 4
        //   206: aload 4
        //   208: invokevirtual 40	com/popularapp/periodcalendar/a/d:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   211: astore 5
        //   213: goto -159 -> 54
        //   216: aload 7
        //   218: ifnull +20 -> 238
        //   221: aload 7
        //   223: invokeinterface 185 1 0
        //   228: ifne +10 -> 238
        //   231: aload 7
        //   233: invokeinterface 61 1 0
        //   238: aload 5
        //   240: ifnull +8 -> 248
        //   243: aload 5
        //   245: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   248: aload 4
        //   250: ifnull +8 -> 258
        //   253: aload 4
        //   255: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   258: aload 8
        //   260: astore_2
        //   261: goto -83 -> 178
        //   264: aload_1
        //   265: instanceof 68
        //   268: ifeq +18 -> 286
        //   271: aload_1
        //   272: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   275: aload 7
        //   277: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   280: aload 8
        //   282: astore_1
        //   283: goto -151 -> 132
        //   286: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   289: aload_1
        //   290: ldc 78
        //   292: iconst_5
        //   293: aload 7
        //   295: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   298: aload_1
        //   299: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   302: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   305: aload 8
        //   307: astore_1
        //   308: goto -176 -> 132
        //   311: astore_1
        //   312: aconst_null
        //   313: astore 5
        //   315: aconst_null
        //   316: astore 6
        //   318: aload 7
        //   320: astore_2
        //   321: aload_2
        //   322: ifnull +18 -> 340
        //   325: aload_2
        //   326: invokeinterface 185 1 0
        //   331: ifne +9 -> 340
        //   334: aload_2
        //   335: invokeinterface 61 1 0
        //   340: aload 5
        //   342: ifnull +8 -> 350
        //   345: aload 5
        //   347: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   350: aload 6
        //   352: ifnull +8 -> 360
        //   355: aload 6
        //   357: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   360: aload_1
        //   361: athrow
        //   362: astore_1
        //   363: aload_0
        //   364: monitorexit
        //   365: aload_1
        //   366: athrow
        //   367: astore_1
        //   368: aconst_null
        //   369: astore 5
        //   371: aload 7
        //   373: astore_2
        //   374: aload 4
        //   376: astore 6
        //   378: goto -57 -> 321
        //   381: astore_1
        //   382: aconst_null
        //   383: astore 5
        //   385: aload 7
        //   387: astore_2
        //   388: aload 4
        //   390: astore 6
        //   392: goto -71 -> 321
        //   395: astore_1
        //   396: aload 6
        //   398: astore_2
        //   399: aload 4
        //   401: astore 6
        //   403: goto -82 -> 321
        //   406: astore_1
        //   407: aload 4
        //   409: astore_2
        //   410: goto -89 -> 321
        //   413: astore 7
        //   415: aconst_null
        //   416: astore 4
        //   418: aconst_null
        //   419: astore 5
        //   421: aconst_null
        //   422: astore 6
        //   424: goto -309 -> 115
        //   427: astore 7
        //   429: aconst_null
        //   430: astore 9
        //   432: aconst_null
        //   433: astore 5
        //   435: aload 4
        //   437: astore 6
        //   439: aload 9
        //   441: astore 4
        //   443: goto -328 -> 115
        //   446: astore 7
        //   448: aconst_null
        //   449: astore 9
        //   451: aconst_null
        //   452: astore 5
        //   454: aload 4
        //   456: astore 6
        //   458: aload 9
        //   460: astore 4
        //   462: goto -347 -> 115
        //   465: astore 7
        //   467: aconst_null
        //   468: astore 9
        //   470: aload 4
        //   472: astore 6
        //   474: aload 9
        //   476: astore 4
        //   478: goto -363 -> 115
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	481	0	this	e
        //   0	481	1	paramContext	Context
        //   0	481	2	paramString	String
        //   0	481	3	paramBoolean	boolean
        //   25	452	4	localObject1	Object
        //   52	401	5	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
        //   1	472	6	localObject2	Object
        //   4	382	7	localObject3	Object
        //   413	1	7	localException1	Exception
        //   427	1	7	localException2	Exception
        //   446	1	7	localException3	Exception
        //   465	1	7	localException4	Exception
        //   15	291	8	localArrayList	ArrayList
        //   101	11	9	localException5	Exception
        //   430	45	9	localObject4	Object
        // Exception table:
        //   from	to	target	type
        //   72	82	101	java/lang/Exception
        //   86	98	101	java/lang/Exception
        //   21	47	311	finally
        //   182	190	311	finally
        //   196	206	311	finally
        //   8	17	362	finally
        //   137	154	362	finally
        //   159	164	362	finally
        //   171	176	362	finally
        //   221	238	362	finally
        //   243	248	362	finally
        //   253	258	362	finally
        //   325	340	362	finally
        //   345	350	362	finally
        //   355	360	362	finally
        //   360	362	362	finally
        //   47	54	367	finally
        //   206	213	381	finally
        //   54	63	395	finally
        //   72	82	395	finally
        //   86	98	395	finally
        //   115	120	406	finally
        //   124	132	406	finally
        //   264	280	406	finally
        //   286	305	406	finally
        //   21	47	413	java/lang/Exception
        //   182	190	413	java/lang/Exception
        //   196	206	413	java/lang/Exception
        //   47	54	427	java/lang/Exception
        //   206	213	446	java/lang/Exception
        //   54	63	465	java/lang/Exception
    }

    /* Error */
    public ArrayList<Pill> a(Context paramContext, boolean paramBoolean)
    {
        // Byte code:
        //   0: aconst_null
        //   1: astore 6
        //   3: aconst_null
        //   4: astore 5
        //   6: aload_0
        //   7: monitorenter
        //   8: new 268	java/util/ArrayList
        //   11: dup
        //   12: invokespecial 269	java/util/ArrayList:<init>	()V
        //   15: astore 7
        //   17: iload_2
        //   18: ifne +188 -> 206
        //   21: aload_1
        //   22: invokestatic 168	com/popularapp/periodcalendar/utils/g:a	(Landroid/content/Context;)Ljava/lang/String;
        //   25: astore_3
        //   26: aload_3
        //   27: ldc 15
        //   29: invokevirtual 174	java/lang/String:equals	(Ljava/lang/Object;)Z
        //   32: ifeq +162 -> 194
        //   35: new 33	com/popularapp/periodcalendar/a/d
        //   38: dup
        //   39: aload_1
        //   40: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   43: astore_3
        //   44: aload_3
        //   45: astore 4
        //   47: aload_3
        //   48: invokevirtual 40	com/popularapp/periodcalendar/a/d:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   51: astore 8
        //   53: aload 8
        //   55: astore 4
        //   57: aload 6
        //   59: astore 5
        //   61: aload 4
        //   63: ldc_w 276
        //   66: aconst_null
        //   67: invokevirtual 48	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   70: astore 6
        //   72: aload 6
        //   74: ifnull +157 -> 231
        //   77: aload 6
        //   79: astore 5
        //   81: aload 6
        //   83: invokeinterface 54 1 0
        //   88: ifeq +143 -> 231
        //   91: aload 6
        //   93: astore 5
        //   95: aload 7
        //   97: aload_0
        //   98: aload 6
        //   100: invokevirtual 182	com/popularapp/periodcalendar/a/e:a	(Landroid/database/Cursor;)Lcom/popularapp/periodcalendar/pill/Pill;
        //   103: invokevirtual 272	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   106: pop
        //   107: goto -30 -> 77
        //   110: astore 8
        //   112: aload_3
        //   113: astore 5
        //   115: aload 4
        //   117: astore_3
        //   118: aload 6
        //   120: astore 4
        //   122: aload 8
        //   124: astore 6
        //   126: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   129: aload_1
        //   130: ldc 78
        //   132: iconst_3
        //   133: aload 6
        //   135: ldc 15
        //   137: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   140: aload 6
        //   142: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   145: iload_2
        //   146: ifne +264 -> 410
        //   149: aload_0
        //   150: aload_1
        //   151: iconst_1
        //   152: invokevirtual 278	com/popularapp/periodcalendar/a/e:a	(Landroid/content/Context;Z)Ljava/util/ArrayList;
        //   155: astore_1
        //   156: aload 4
        //   158: ifnull +10 -> 168
        //   161: aload 4
        //   163: invokeinterface 61 1 0
        //   168: aload_3
        //   169: ifnull +7 -> 176
        //   172: aload_3
        //   173: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   176: aload_1
        //   177: astore_3
        //   178: aload 5
        //   180: ifnull +10 -> 190
        //   183: aload 5
        //   185: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   188: aload_1
        //   189: astore_3
        //   190: aload_0
        //   191: monitorexit
        //   192: aload_3
        //   193: areturn
        //   194: aload_3
        //   195: aconst_null
        //   196: invokestatic 189	android/database/sqlite/SQLiteDatabase:openOrCreateDatabase	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;
        //   199: astore 4
        //   201: aconst_null
        //   202: astore_3
        //   203: goto -146 -> 57
        //   206: new 33	com/popularapp/periodcalendar/a/d
        //   209: dup
        //   210: aload_1
        //   211: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   214: astore_3
        //   215: aload_3
        //   216: astore 4
        //   218: aload_3
        //   219: invokevirtual 40	com/popularapp/periodcalendar/a/d:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   222: astore 8
        //   224: aload 8
        //   226: astore 4
        //   228: goto -171 -> 57
        //   231: aload 6
        //   233: ifnull +10 -> 243
        //   236: aload 6
        //   238: invokeinterface 61 1 0
        //   243: aload 4
        //   245: ifnull +8 -> 253
        //   248: aload 4
        //   250: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   253: aload_3
        //   254: ifnull +162 -> 416
        //   257: aload_3
        //   258: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   261: goto +155 -> 416
        //   264: aload 5
        //   266: ifnull +10 -> 276
        //   269: aload 5
        //   271: invokeinterface 61 1 0
        //   276: aload_3
        //   277: ifnull +7 -> 284
        //   280: aload_3
        //   281: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   284: aload 4
        //   286: ifnull +8 -> 294
        //   289: aload 4
        //   291: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   294: aload_1
        //   295: athrow
        //   296: astore_1
        //   297: aload_0
        //   298: monitorexit
        //   299: aload_1
        //   300: athrow
        //   301: astore_1
        //   302: aconst_null
        //   303: astore_3
        //   304: goto -40 -> 264
        //   307: astore_1
        //   308: aload 4
        //   310: astore 6
        //   312: aload_3
        //   313: astore 4
        //   315: aload 6
        //   317: astore_3
        //   318: goto -54 -> 264
        //   321: astore_1
        //   322: aload 4
        //   324: astore 6
        //   326: aload 5
        //   328: astore 4
        //   330: aload 6
        //   332: astore 5
        //   334: goto -70 -> 264
        //   337: astore 6
        //   339: aconst_null
        //   340: astore 4
        //   342: aconst_null
        //   343: astore_3
        //   344: aconst_null
        //   345: astore 5
        //   347: goto -221 -> 126
        //   350: astore 6
        //   352: aconst_null
        //   353: astore 4
        //   355: aconst_null
        //   356: astore 8
        //   358: aload_3
        //   359: astore 5
        //   361: aload 8
        //   363: astore_3
        //   364: goto -238 -> 126
        //   367: astore 6
        //   369: aconst_null
        //   370: astore 4
        //   372: aconst_null
        //   373: astore 8
        //   375: aload_3
        //   376: astore 5
        //   378: aload 8
        //   380: astore_3
        //   381: goto -255 -> 126
        //   384: astore 6
        //   386: aconst_null
        //   387: astore 9
        //   389: aload 4
        //   391: astore 5
        //   393: aload_3
        //   394: astore 8
        //   396: aload 9
        //   398: astore 4
        //   400: aload 5
        //   402: astore_3
        //   403: aload 8
        //   405: astore 5
        //   407: goto -281 -> 126
        //   410: aload 7
        //   412: astore_1
        //   413: goto -257 -> 156
        //   416: aload 7
        //   418: astore_3
        //   419: goto -229 -> 190
        //   422: astore_1
        //   423: aconst_null
        //   424: astore_3
        //   425: aconst_null
        //   426: astore 4
        //   428: goto -164 -> 264
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	431	0	this	e
        //   0	431	1	paramContext	Context
        //   0	431	2	paramBoolean	boolean
        //   25	400	3	localObject1	Object
        //   45	382	4	localObject2	Object
        //   4	402	5	localObject3	Object
        //   1	330	6	localObject4	Object
        //   337	1	6	localException1	Exception
        //   350	1	6	localException2	Exception
        //   367	1	6	localException3	Exception
        //   384	1	6	localException4	Exception
        //   15	402	7	localArrayList	ArrayList
        //   51	3	8	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
        //   110	13	8	localException5	Exception
        //   222	182	8	localObject5	Object
        //   387	10	9	localObject6	Object
        // Exception table:
        //   from	to	target	type
        //   81	91	110	java/lang/Exception
        //   95	107	110	java/lang/Exception
        //   8	17	296	finally
        //   161	168	296	finally
        //   172	176	296	finally
        //   183	188	296	finally
        //   236	243	296	finally
        //   248	253	296	finally
        //   257	261	296	finally
        //   269	276	296	finally
        //   280	284	296	finally
        //   289	294	296	finally
        //   294	296	296	finally
        //   47	53	301	finally
        //   218	224	301	finally
        //   61	72	307	finally
        //   81	91	307	finally
        //   95	107	307	finally
        //   126	145	321	finally
        //   149	156	321	finally
        //   21	44	337	java/lang/Exception
        //   194	201	337	java/lang/Exception
        //   206	215	337	java/lang/Exception
        //   47	53	350	java/lang/Exception
        //   218	224	367	java/lang/Exception
        //   61	72	384	java/lang/Exception
        //   21	44	422	finally
        //   194	201	422	finally
        //   206	215	422	finally
    }

    /* Error */
    public void a(Context paramContext, long paramLong)
    {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: invokestatic 160	com/popularapp/periodcalendar/notification/e:a	()Lcom/popularapp/periodcalendar/notification/e;
        //   5: aload_1
        //   6: lload_2
        //   7: invokevirtual 282	com/popularapp/periodcalendar/notification/e:a	(Landroid/content/Context;J)V
        //   10: new 33	com/popularapp/periodcalendar/a/d
        //   13: dup
        //   14: aload_1
        //   15: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   18: astore 4
        //   20: aload 4
        //   22: invokevirtual 93	com/popularapp/periodcalendar/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   25: astore 5
        //   27: aload 5
        //   29: new 17	java/lang/StringBuilder
        //   32: dup
        //   33: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   36: ldc_w 284
        //   39: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   42: lload_2
        //   43: invokevirtual 179	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   46: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   49: invokevirtual 287	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
        //   52: aload 5
        //   54: ifnull +8 -> 62
        //   57: aload 5
        //   59: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   62: aload 4
        //   64: ifnull +8 -> 72
        //   67: aload 4
        //   69: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   72: invokestatic 292	com/popularapp/periodcalendar/notification/c:a	()Lcom/popularapp/periodcalendar/notification/c;
        //   75: aload_1
        //   76: ldc2_w 293
        //   79: lload_2
        //   80: ladd
        //   81: l2i
        //   82: invokevirtual 297	com/popularapp/periodcalendar/notification/c:a	(Landroid/content/Context;I)V
        //   85: aload_0
        //   86: monitorexit
        //   87: return
        //   88: astore 6
        //   90: aconst_null
        //   91: astore 4
        //   93: aconst_null
        //   94: astore 5
        //   96: aload 6
        //   98: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   101: aload_1
        //   102: instanceof 68
        //   105: ifeq +40 -> 145
        //   108: aload_1
        //   109: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   112: aload 6
        //   114: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   117: aload 4
        //   119: ifnull +8 -> 127
        //   122: aload 4
        //   124: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   127: aload 5
        //   129: ifnull -57 -> 72
        //   132: aload 5
        //   134: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   137: goto -65 -> 72
        //   140: astore_1
        //   141: aload_0
        //   142: monitorexit
        //   143: aload_1
        //   144: athrow
        //   145: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   148: aload_1
        //   149: ldc 78
        //   151: bipush 13
        //   153: aload 6
        //   155: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   158: aload_1
        //   159: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   162: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   165: goto -48 -> 117
        //   168: astore_1
        //   169: aload 4
        //   171: ifnull +8 -> 179
        //   174: aload 4
        //   176: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   179: aload 5
        //   181: ifnull +8 -> 189
        //   184: aload 5
        //   186: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   189: aload_1
        //   190: athrow
        //   191: astore_1
        //   192: aconst_null
        //   193: astore 4
        //   195: aconst_null
        //   196: astore 5
        //   198: goto -29 -> 169
        //   201: astore_1
        //   202: aconst_null
        //   203: astore 6
        //   205: aload 4
        //   207: astore 5
        //   209: aload 6
        //   211: astore 4
        //   213: goto -44 -> 169
        //   216: astore_1
        //   217: aload 4
        //   219: astore 6
        //   221: aload 5
        //   223: astore 4
        //   225: aload 6
        //   227: astore 5
        //   229: goto -60 -> 169
        //   232: astore 6
        //   234: aconst_null
        //   235: astore 7
        //   237: aload 4
        //   239: astore 5
        //   241: aload 7
        //   243: astore 4
        //   245: goto -149 -> 96
        //   248: astore 6
        //   250: aload 4
        //   252: astore 7
        //   254: aload 5
        //   256: astore 4
        //   258: aload 7
        //   260: astore 5
        //   262: goto -166 -> 96
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	265	0	this	e
        //   0	265	1	paramContext	Context
        //   0	265	2	paramLong	long
        //   18	239	4	localObject1	Object
        //   25	236	5	localObject2	Object
        //   88	66	6	localException1	Exception
        //   203	23	6	localObject3	Object
        //   232	1	6	localException2	Exception
        //   248	1	6	localException3	Exception
        //   235	24	7	localObject4	Object
        // Exception table:
        //   from	to	target	type
        //   10	20	88	java/lang/Exception
        //   2	10	140	finally
        //   57	62	140	finally
        //   67	72	140	finally
        //   72	85	140	finally
        //   122	127	140	finally
        //   132	137	140	finally
        //   174	179	140	finally
        //   184	189	140	finally
        //   189	191	140	finally
        //   96	117	168	finally
        //   145	165	168	finally
        //   10	20	191	finally
        //   20	27	201	finally
        //   27	52	216	finally
        //   20	27	232	java/lang/Exception
        //   27	52	248	java/lang/Exception
    }

    /* Error */
    public void a(Context paramContext, long paramLong, int paramInt)
    {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: invokestatic 160	com/popularapp/periodcalendar/notification/e:a	()Lcom/popularapp/periodcalendar/notification/e;
        //   5: aload_1
        //   6: lload_2
        //   7: invokevirtual 282	com/popularapp/periodcalendar/notification/e:a	(Landroid/content/Context;J)V
        //   10: new 33	com/popularapp/periodcalendar/a/d
        //   13: dup
        //   14: aload_1
        //   15: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   18: astore 5
        //   20: aload 5
        //   22: invokevirtual 93	com/popularapp/periodcalendar/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   25: astore 6
        //   27: new 95	android/content/ContentValues
        //   30: dup
        //   31: invokespecial 96	android/content/ContentValues:<init>	()V
        //   34: astore 7
        //   36: aload 7
        //   38: ldc -26
        //   40: iload 4
        //   42: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   45: invokevirtual 141	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
        //   48: aload 6
        //   50: ldc -108
        //   52: aload 7
        //   54: new 17	java/lang/StringBuilder
        //   57: dup
        //   58: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   61: ldc_w 300
        //   64: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   67: lload_2
        //   68: invokevirtual 179	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   71: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   74: aconst_null
        //   75: invokevirtual 304	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   78: pop
        //   79: aload 6
        //   81: ifnull +8 -> 89
        //   84: aload 6
        //   86: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   89: aload 5
        //   91: ifnull +8 -> 99
        //   94: aload 5
        //   96: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   99: invokestatic 160	com/popularapp/periodcalendar/notification/e:a	()Lcom/popularapp/periodcalendar/notification/e;
        //   102: aload_1
        //   103: iconst_1
        //   104: invokevirtual 163	com/popularapp/periodcalendar/notification/e:a	(Landroid/content/Context;Z)V
        //   107: aload_0
        //   108: monitorexit
        //   109: return
        //   110: astore 7
        //   112: aconst_null
        //   113: astore 5
        //   115: aconst_null
        //   116: astore 6
        //   118: aload 7
        //   120: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   123: aload_1
        //   124: instanceof 68
        //   127: ifeq +40 -> 167
        //   130: aload_1
        //   131: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   134: aload 7
        //   136: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   139: aload 5
        //   141: ifnull +8 -> 149
        //   144: aload 5
        //   146: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   149: aload 6
        //   151: ifnull -52 -> 99
        //   154: aload 6
        //   156: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   159: goto -60 -> 99
        //   162: astore_1
        //   163: aload_0
        //   164: monitorexit
        //   165: aload_1
        //   166: athrow
        //   167: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   170: aload_1
        //   171: ldc 78
        //   173: bipush 9
        //   175: aload 7
        //   177: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   180: aload_1
        //   181: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   184: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   187: goto -48 -> 139
        //   190: astore_1
        //   191: aload 5
        //   193: ifnull +8 -> 201
        //   196: aload 5
        //   198: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   201: aload 6
        //   203: ifnull +8 -> 211
        //   206: aload 6
        //   208: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   211: aload_1
        //   212: athrow
        //   213: astore_1
        //   214: aconst_null
        //   215: astore 5
        //   217: aconst_null
        //   218: astore 6
        //   220: goto -29 -> 191
        //   223: astore_1
        //   224: aconst_null
        //   225: astore 7
        //   227: aload 5
        //   229: astore 6
        //   231: aload 7
        //   233: astore 5
        //   235: goto -44 -> 191
        //   238: astore_1
        //   239: aload 6
        //   241: astore 7
        //   243: aload 5
        //   245: astore 6
        //   247: aload 7
        //   249: astore 5
        //   251: goto -60 -> 191
        //   254: astore 7
        //   256: aconst_null
        //   257: astore 8
        //   259: aload 5
        //   261: astore 6
        //   263: aload 8
        //   265: astore 5
        //   267: goto -149 -> 118
        //   270: astore 7
        //   272: aload 5
        //   274: astore 8
        //   276: aload 6
        //   278: astore 5
        //   280: aload 8
        //   282: astore 6
        //   284: goto -166 -> 118
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	287	0	this	e
        //   0	287	1	paramContext	Context
        //   0	287	2	paramLong	long
        //   0	287	4	paramInt	int
        //   18	261	5	localObject1	Object
        //   25	258	6	localObject2	Object
        //   34	19	7	localContentValues	android.content.ContentValues
        //   110	66	7	localException1	Exception
        //   225	23	7	localObject3	Object
        //   254	1	7	localException2	Exception
        //   270	1	7	localException3	Exception
        //   257	24	8	localObject4	Object
        // Exception table:
        //   from	to	target	type
        //   10	20	110	java/lang/Exception
        //   2	10	162	finally
        //   84	89	162	finally
        //   94	99	162	finally
        //   99	107	162	finally
        //   144	149	162	finally
        //   154	159	162	finally
        //   196	201	162	finally
        //   206	211	162	finally
        //   211	213	162	finally
        //   118	139	190	finally
        //   167	187	190	finally
        //   10	20	213	finally
        //   20	27	223	finally
        //   27	79	238	finally
        //   20	27	254	java/lang/Exception
        //   27	79	270	java/lang/Exception
    }

    /* Error */
    public void a(Context paramContext, String paramString, long paramLong)
    {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: new 33	com/popularapp/periodcalendar/a/d
        //   5: dup
        //   6: aload_1
        //   7: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   10: astore 5
        //   12: aload 5
        //   14: invokevirtual 93	com/popularapp/periodcalendar/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   17: astore 6
        //   19: new 95	android/content/ContentValues
        //   22: dup
        //   23: invokespecial 96	android/content/ContentValues:<init>	()V
        //   26: astore 7
        //   28: aload 7
        //   30: ldc 116
        //   32: aload_2
        //   33: invokevirtual 122	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
        //   36: aload 6
        //   38: ldc -108
        //   40: aload 7
        //   42: new 17	java/lang/StringBuilder
        //   45: dup
        //   46: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   49: ldc_w 300
        //   52: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   55: lload_3
        //   56: invokevirtual 179	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   59: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   62: aconst_null
        //   63: invokevirtual 304	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   66: pop
        //   67: aload 6
        //   69: ifnull +8 -> 77
        //   72: aload 6
        //   74: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   77: aload 5
        //   79: ifnull +8 -> 87
        //   82: aload 5
        //   84: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   87: aload_0
        //   88: monitorexit
        //   89: return
        //   90: astore 6
        //   92: aconst_null
        //   93: astore_2
        //   94: aconst_null
        //   95: astore 5
        //   97: aload 6
        //   99: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   102: aload_1
        //   103: instanceof 68
        //   106: ifeq +38 -> 144
        //   109: aload_1
        //   110: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   113: aload 6
        //   115: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   118: aload_2
        //   119: ifnull +7 -> 126
        //   122: aload_2
        //   123: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   126: aload 5
        //   128: ifnull -41 -> 87
        //   131: aload 5
        //   133: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   136: goto -49 -> 87
        //   139: astore_1
        //   140: aload_0
        //   141: monitorexit
        //   142: aload_1
        //   143: athrow
        //   144: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   147: aload_1
        //   148: ldc 78
        //   150: bipush 14
        //   152: aload 6
        //   154: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   157: aload_1
        //   158: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   161: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   164: goto -46 -> 118
        //   167: astore_1
        //   168: aload_2
        //   169: ifnull +7 -> 176
        //   172: aload_2
        //   173: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   176: aload 5
        //   178: ifnull +8 -> 186
        //   181: aload 5
        //   183: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   186: aload_1
        //   187: athrow
        //   188: astore_1
        //   189: aconst_null
        //   190: astore_2
        //   191: aconst_null
        //   192: astore 5
        //   194: goto -26 -> 168
        //   197: astore_1
        //   198: aconst_null
        //   199: astore_2
        //   200: goto -32 -> 168
        //   203: astore_1
        //   204: aload 6
        //   206: astore_2
        //   207: goto -39 -> 168
        //   210: astore 6
        //   212: aconst_null
        //   213: astore_2
        //   214: goto -117 -> 97
        //   217: astore 7
        //   219: aload 6
        //   221: astore_2
        //   222: aload 7
        //   224: astore 6
        //   226: goto -129 -> 97
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	229	0	this	e
        //   0	229	1	paramContext	Context
        //   0	229	2	paramString	String
        //   0	229	3	paramLong	long
        //   10	183	5	locald	d
        //   17	56	6	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
        //   90	115	6	localException1	Exception
        //   210	10	6	localException2	Exception
        //   224	1	6	localObject	Object
        //   26	15	7	localContentValues	android.content.ContentValues
        //   217	6	7	localException3	Exception
        // Exception table:
        //   from	to	target	type
        //   2	12	90	java/lang/Exception
        //   72	77	139	finally
        //   82	87	139	finally
        //   122	126	139	finally
        //   131	136	139	finally
        //   172	176	139	finally
        //   181	186	139	finally
        //   186	188	139	finally
        //   97	118	167	finally
        //   144	164	167	finally
        //   2	12	188	finally
        //   12	19	197	finally
        //   19	67	203	finally
        //   12	19	210	java/lang/Exception
        //   19	67	217	java/lang/Exception
    }

    /* Error */
    public boolean a(Context paramContext)
    {
        // Byte code:
        //   0: aconst_null
        //   1: astore 7
        //   3: aconst_null
        //   4: astore 8
        //   6: iconst_1
        //   7: istore 5
        //   9: aload_0
        //   10: monitorenter
        //   11: new 33	com/popularapp/periodcalendar/a/d
        //   14: dup
        //   15: aload_1
        //   16: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   19: astore 6
        //   21: aload 7
        //   23: astore 8
        //   25: aload 6
        //   27: invokevirtual 93	com/popularapp/periodcalendar/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   30: astore 7
        //   32: aload 7
        //   34: astore 8
        //   36: aload 7
        //   38: invokevirtual 311	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
        //   41: aload 7
        //   43: astore 8
        //   45: aload_1
        //   46: invokestatic 316	com/popularapp/periodcalendar/a/a:av	(Landroid/content/Context;)Ljava/lang/String;
        //   49: astore 9
        //   51: aload 7
        //   53: astore 8
        //   55: aload_1
        //   56: invokestatic 319	com/popularapp/periodcalendar/a/a:f	(Landroid/content/Context;)I
        //   59: istore_3
        //   60: aload 7
        //   62: astore 8
        //   64: new 321	java/util/StringTokenizer
        //   67: dup
        //   68: aload 9
        //   70: ldc_w 323
        //   73: invokespecial 325	java/util/StringTokenizer:<init>	(Ljava/lang/String;Ljava/lang/String;)V
        //   76: astore 9
        //   78: iconst_0
        //   79: istore_2
        //   80: aload 7
        //   82: astore 8
        //   84: aload 9
        //   86: invokevirtual 328	java/util/StringTokenizer:hasMoreElements	()Z
        //   89: ifeq +151 -> 240
        //   92: aload 7
        //   94: astore 8
        //   96: new 17	java/lang/StringBuilder
        //   99: dup
        //   100: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   103: aload 9
        //   105: invokevirtual 332	java/util/StringTokenizer:nextElement	()Ljava/lang/Object;
        //   108: invokevirtual 333	java/lang/Object:toString	()Ljava/lang/String;
        //   111: invokevirtual 336	java/lang/String:trim	()Ljava/lang/String;
        //   114: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: ldc 15
        //   119: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   122: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   125: astore 10
        //   127: aload 7
        //   129: astore 8
        //   131: new 95	android/content/ContentValues
        //   134: dup
        //   135: invokespecial 96	android/content/ContentValues:<init>	()V
        //   138: astore 11
        //   140: aload 7
        //   142: astore 8
        //   144: aload 11
        //   146: ldc 98
        //   148: iload_3
        //   149: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   152: invokevirtual 141	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
        //   155: aload 7
        //   157: astore 8
        //   159: aload 11
        //   161: ldc 116
        //   163: aload 10
        //   165: invokevirtual 122	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
        //   168: aload 7
        //   170: astore 8
        //   172: aload 11
        //   174: ldc -127
        //   176: iconst_0
        //   177: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   180: invokevirtual 141	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
        //   183: aload 7
        //   185: astore 8
        //   187: aload 11
        //   189: ldc -113
        //   191: iconst_1
        //   192: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   195: invokevirtual 141	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
        //   198: aload 7
        //   200: astore 8
        //   202: aload 11
        //   204: ldc 124
        //   206: invokestatic 259	java/lang/System:currentTimeMillis	()J
        //   209: iload_2
        //   210: i2l
        //   211: ladd
        //   212: invokestatic 110	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   215: invokevirtual 114	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
        //   218: aload 7
        //   220: astore 8
        //   222: aload 7
        //   224: ldc -108
        //   226: aconst_null
        //   227: aload 11
        //   229: invokevirtual 152	android/database/sqlite/SQLiteDatabase:insert	(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
        //   232: pop2
        //   233: iload_2
        //   234: iconst_1
        //   235: iadd
        //   236: istore_2
        //   237: goto -157 -> 80
        //   240: aload 7
        //   242: astore 8
        //   244: aload 7
        //   246: invokevirtual 339	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
        //   249: aload 7
        //   251: astore 8
        //   253: aload 7
        //   255: invokevirtual 342	android/database/sqlite/SQLiteDatabase:endTransaction	()V
        //   258: aload 7
        //   260: ifnull +16 -> 276
        //   263: aload 7
        //   265: invokevirtual 345	android/database/sqlite/SQLiteDatabase:isOpen	()Z
        //   268: ifeq +8 -> 276
        //   271: aload 7
        //   273: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   276: iload 5
        //   278: istore 4
        //   280: aload 6
        //   282: ifnull +12 -> 294
        //   285: aload 6
        //   287: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   290: iload 5
        //   292: istore 4
        //   294: aload_0
        //   295: monitorexit
        //   296: iload 4
        //   298: ireturn
        //   299: astore 9
        //   301: aconst_null
        //   302: astore 6
        //   304: aconst_null
        //   305: astore 7
        //   307: aload 6
        //   309: astore 10
        //   311: aload 7
        //   313: astore 8
        //   315: aload 9
        //   317: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   320: aload 6
        //   322: astore 10
        //   324: aload 7
        //   326: astore 8
        //   328: aload_1
        //   329: instanceof 68
        //   332: ifeq +54 -> 386
        //   335: aload 6
        //   337: astore 10
        //   339: aload 7
        //   341: astore 8
        //   343: aload_1
        //   344: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   347: aload 9
        //   349: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   352: aload 6
        //   354: ifnull +16 -> 370
        //   357: aload 6
        //   359: invokevirtual 345	android/database/sqlite/SQLiteDatabase:isOpen	()Z
        //   362: ifeq +8 -> 370
        //   365: aload 6
        //   367: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   370: aload 7
        //   372: ifnull +8 -> 380
        //   375: aload 7
        //   377: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   380: iconst_0
        //   381: istore 4
        //   383: goto -89 -> 294
        //   386: aload 6
        //   388: astore 10
        //   390: aload 7
        //   392: astore 8
        //   394: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   397: aload_1
        //   398: ldc 78
        //   400: iconst_0
        //   401: aload 9
        //   403: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   406: aload_1
        //   407: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   410: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   413: goto -61 -> 352
        //   416: astore_1
        //   417: aload 8
        //   419: astore 6
        //   421: aload 10
        //   423: astore 8
        //   425: aload 8
        //   427: ifnull +16 -> 443
        //   430: aload 8
        //   432: invokevirtual 345	android/database/sqlite/SQLiteDatabase:isOpen	()Z
        //   435: ifeq +8 -> 443
        //   438: aload 8
        //   440: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   443: aload 6
        //   445: ifnull +8 -> 453
        //   448: aload 6
        //   450: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   453: aload_1
        //   454: athrow
        //   455: astore_1
        //   456: aload_0
        //   457: monitorexit
        //   458: aload_1
        //   459: athrow
        //   460: astore 9
        //   462: aconst_null
        //   463: astore 6
        //   465: aconst_null
        //   466: astore 7
        //   468: aload 6
        //   470: astore 10
        //   472: aload 7
        //   474: astore 8
        //   476: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   479: aload_1
        //   480: ldc 78
        //   482: iconst_1
        //   483: aload 9
        //   485: ldc 15
        //   487: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   490: aload 6
        //   492: astore 10
        //   494: aload 7
        //   496: astore 8
        //   498: aload 9
        //   500: invokevirtual 346	java/lang/Error:printStackTrace	()V
        //   503: aload 6
        //   505: ifnull +16 -> 521
        //   508: aload 6
        //   510: invokevirtual 345	android/database/sqlite/SQLiteDatabase:isOpen	()Z
        //   513: ifeq +8 -> 521
        //   516: aload 6
        //   518: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   521: aload 7
        //   523: ifnull -143 -> 380
        //   526: aload 7
        //   528: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   531: goto -151 -> 380
        //   534: astore_1
        //   535: aconst_null
        //   536: astore 6
        //   538: goto -113 -> 425
        //   541: astore_1
        //   542: goto -117 -> 425
        //   545: astore 9
        //   547: aconst_null
        //   548: astore 8
        //   550: aload 6
        //   552: astore 7
        //   554: aload 8
        //   556: astore 6
        //   558: goto -90 -> 468
        //   561: astore 9
        //   563: aload 6
        //   565: astore 8
        //   567: aload 7
        //   569: astore 6
        //   571: aload 8
        //   573: astore 7
        //   575: goto -107 -> 468
        //   578: astore 9
        //   580: aconst_null
        //   581: astore 8
        //   583: aload 6
        //   585: astore 7
        //   587: aload 8
        //   589: astore 6
        //   591: goto -284 -> 307
        //   594: astore 9
        //   596: aload 6
        //   598: astore 8
        //   600: aload 7
        //   602: astore 6
        //   604: aload 8
        //   606: astore 7
        //   608: goto -301 -> 307
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	611	0	this	e
        //   0	611	1	paramContext	Context
        //   79	158	2	i	int
        //   59	90	3	j	int
        //   278	104	4	bool1	boolean
        //   7	284	5	bool2	boolean
        //   19	584	6	localObject1	Object
        //   1	606	7	localObject2	Object
        //   4	601	8	localObject3	Object
        //   49	55	9	localObject4	Object
        //   299	103	9	localException1	Exception
        //   460	39	9	localError1	Error
        //   545	1	9	localError2	Error
        //   561	1	9	localError3	Error
        //   578	1	9	localException2	Exception
        //   594	1	9	localException3	Exception
        //   125	368	10	localObject5	Object
        //   138	90	11	localContentValues	android.content.ContentValues
        // Exception table:
        //   from	to	target	type
        //   11	21	299	java/lang/Exception
        //   315	320	416	finally
        //   328	335	416	finally
        //   343	352	416	finally
        //   394	413	416	finally
        //   476	490	416	finally
        //   498	503	416	finally
        //   263	276	455	finally
        //   285	290	455	finally
        //   357	370	455	finally
        //   375	380	455	finally
        //   430	443	455	finally
        //   448	453	455	finally
        //   453	455	455	finally
        //   508	521	455	finally
        //   526	531	455	finally
        //   11	21	460	java/lang/Error
        //   11	21	534	finally
        //   25	32	541	finally
        //   36	41	541	finally
        //   45	51	541	finally
        //   55	60	541	finally
        //   64	78	541	finally
        //   84	92	541	finally
        //   96	127	541	finally
        //   131	140	541	finally
        //   144	155	541	finally
        //   159	168	541	finally
        //   172	183	541	finally
        //   187	198	541	finally
        //   202	218	541	finally
        //   222	233	541	finally
        //   244	249	541	finally
        //   253	258	541	finally
        //   25	32	545	java/lang/Error
        //   36	41	561	java/lang/Error
        //   45	51	561	java/lang/Error
        //   55	60	561	java/lang/Error
        //   64	78	561	java/lang/Error
        //   84	92	561	java/lang/Error
        //   96	127	561	java/lang/Error
        //   131	140	561	java/lang/Error
        //   144	155	561	java/lang/Error
        //   159	168	561	java/lang/Error
        //   172	183	561	java/lang/Error
        //   187	198	561	java/lang/Error
        //   202	218	561	java/lang/Error
        //   222	233	561	java/lang/Error
        //   244	249	561	java/lang/Error
        //   253	258	561	java/lang/Error
        //   25	32	578	java/lang/Exception
        //   36	41	594	java/lang/Exception
        //   45	51	594	java/lang/Exception
        //   55	60	594	java/lang/Exception
        //   64	78	594	java/lang/Exception
        //   84	92	594	java/lang/Exception
        //   96	127	594	java/lang/Exception
        //   131	140	594	java/lang/Exception
        //   144	155	594	java/lang/Exception
        //   159	168	594	java/lang/Exception
        //   172	183	594	java/lang/Exception
        //   187	198	594	java/lang/Exception
        //   202	218	594	java/lang/Exception
        //   222	233	594	java/lang/Exception
        //   244	249	594	java/lang/Exception
        //   253	258	594	java/lang/Exception
    }

    /* Error */
    public ArrayList<Pill> b(Context paramContext, int paramInt)
    {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: new 268	java/util/ArrayList
        //   5: dup
        //   6: invokespecial 269	java/util/ArrayList:<init>	()V
        //   9: astore 8
        //   11: new 33	com/popularapp/periodcalendar/a/d
        //   14: dup
        //   15: aload_1
        //   16: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   19: astore_3
        //   20: aload_3
        //   21: invokevirtual 40	com/popularapp/periodcalendar/a/d:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   24: astore 4
        //   26: aload_1
        //   27: invokestatic 350	com/popularapp/periodcalendar/a/a:r	(Landroid/content/Context;)Z
        //   30: ifeq +168 -> 198
        //   33: aload 4
        //   35: new 17	java/lang/StringBuilder
        //   38: dup
        //   39: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   42: ldc_w 352
        //   45: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   48: iload_2
        //   49: invokevirtual 27	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   52: ldc -4
        //   54: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   57: ldc -26
        //   59: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   62: ldc_w 354
        //   65: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   68: iconst_2
        //   69: invokevirtual 27	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   72: ldc_w 356
        //   75: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   78: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   81: aconst_null
        //   82: invokevirtual 48	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   85: astore 5
        //   87: aload 5
        //   89: ifnull +166 -> 255
        //   92: aload 5
        //   94: invokeinterface 54 1 0
        //   99: ifeq +156 -> 255
        //   102: aload 8
        //   104: aload_0
        //   105: aload 5
        //   107: invokevirtual 182	com/popularapp/periodcalendar/a/e:a	(Landroid/database/Cursor;)Lcom/popularapp/periodcalendar/pill/Pill;
        //   110: invokevirtual 272	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   113: pop
        //   114: goto -22 -> 92
        //   117: astore 7
        //   119: aload 5
        //   121: astore 6
        //   123: aload_3
        //   124: astore 5
        //   126: aload 6
        //   128: astore_3
        //   129: aload 7
        //   131: astore 6
        //   133: aload 6
        //   135: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   138: aload_1
        //   139: instanceof 68
        //   142: ifeq +161 -> 303
        //   145: aload_1
        //   146: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   149: aload 6
        //   151: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   154: aload_3
        //   155: ifnull +18 -> 173
        //   158: aload_3
        //   159: invokeinterface 185 1 0
        //   164: ifne +9 -> 173
        //   167: aload_3
        //   168: invokeinterface 61 1 0
        //   173: aload 4
        //   175: ifnull +8 -> 183
        //   178: aload 4
        //   180: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   183: aload 5
        //   185: ifnull +8 -> 193
        //   188: aload 5
        //   190: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   193: aload_0
        //   194: monitorexit
        //   195: aload 8
        //   197: areturn
        //   198: aload 4
        //   200: new 17	java/lang/StringBuilder
        //   203: dup
        //   204: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   207: ldc_w 352
        //   210: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   213: iload_2
        //   214: invokevirtual 27	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   217: ldc -4
        //   219: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   222: ldc -26
        //   224: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   227: ldc_w 354
        //   230: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   233: iconst_2
        //   234: invokevirtual 27	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   237: ldc_w 358
        //   240: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   243: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   246: aconst_null
        //   247: invokevirtual 48	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   250: astore 5
        //   252: goto -165 -> 87
        //   255: aload 5
        //   257: ifnull +20 -> 277
        //   260: aload 5
        //   262: invokeinterface 185 1 0
        //   267: ifne +10 -> 277
        //   270: aload 5
        //   272: invokeinterface 61 1 0
        //   277: aload 4
        //   279: ifnull +8 -> 287
        //   282: aload 4
        //   284: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   287: aload_3
        //   288: ifnull -95 -> 193
        //   291: aload_3
        //   292: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   295: goto -102 -> 193
        //   298: astore_1
        //   299: aload_0
        //   300: monitorexit
        //   301: aload_1
        //   302: athrow
        //   303: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   306: aload_1
        //   307: ldc 78
        //   309: iconst_4
        //   310: aload 6
        //   312: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   315: aload_1
        //   316: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   319: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   322: goto -168 -> 154
        //   325: astore_1
        //   326: aload_3
        //   327: ifnull +18 -> 345
        //   330: aload_3
        //   331: invokeinterface 185 1 0
        //   336: ifne +9 -> 345
        //   339: aload_3
        //   340: invokeinterface 61 1 0
        //   345: aload 4
        //   347: ifnull +8 -> 355
        //   350: aload 4
        //   352: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   355: aload 5
        //   357: ifnull +8 -> 365
        //   360: aload 5
        //   362: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   365: aload_1
        //   366: athrow
        //   367: astore_1
        //   368: aconst_null
        //   369: astore_3
        //   370: aconst_null
        //   371: astore 5
        //   373: aconst_null
        //   374: astore 4
        //   376: goto -50 -> 326
        //   379: astore_1
        //   380: aconst_null
        //   381: astore 6
        //   383: aconst_null
        //   384: astore 4
        //   386: aload_3
        //   387: astore 5
        //   389: aload 6
        //   391: astore_3
        //   392: goto -66 -> 326
        //   395: astore_1
        //   396: aconst_null
        //   397: astore 6
        //   399: aload_3
        //   400: astore 5
        //   402: aload 6
        //   404: astore_3
        //   405: goto -79 -> 326
        //   408: astore_1
        //   409: aload 5
        //   411: astore 6
        //   413: aload_3
        //   414: astore 5
        //   416: aload 6
        //   418: astore_3
        //   419: goto -93 -> 326
        //   422: astore 6
        //   424: aconst_null
        //   425: astore_3
        //   426: aconst_null
        //   427: astore 4
        //   429: aconst_null
        //   430: astore 5
        //   432: goto -299 -> 133
        //   435: astore 6
        //   437: aconst_null
        //   438: astore 7
        //   440: aconst_null
        //   441: astore 4
        //   443: aload_3
        //   444: astore 5
        //   446: aload 7
        //   448: astore_3
        //   449: goto -316 -> 133
        //   452: astore 6
        //   454: aconst_null
        //   455: astore 7
        //   457: aload_3
        //   458: astore 5
        //   460: aload 7
        //   462: astore_3
        //   463: goto -330 -> 133
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	466	0	this	e
        //   0	466	1	paramContext	Context
        //   0	466	2	paramInt	int
        //   19	444	3	localObject1	Object
        //   24	418	4	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
        //   85	374	5	localObject2	Object
        //   121	296	6	localObject3	Object
        //   422	1	6	localException1	Exception
        //   435	1	6	localException2	Exception
        //   452	1	6	localException3	Exception
        //   117	13	7	localException4	Exception
        //   438	23	7	localObject4	Object
        //   9	187	8	localArrayList	ArrayList
        // Exception table:
        //   from	to	target	type
        //   92	114	117	java/lang/Exception
        //   2	11	298	finally
        //   158	173	298	finally
        //   178	183	298	finally
        //   188	193	298	finally
        //   260	277	298	finally
        //   282	287	298	finally
        //   291	295	298	finally
        //   330	345	298	finally
        //   350	355	298	finally
        //   360	365	298	finally
        //   365	367	298	finally
        //   133	154	325	finally
        //   303	322	325	finally
        //   11	20	367	finally
        //   20	26	379	finally
        //   26	87	395	finally
        //   198	252	395	finally
        //   92	114	408	finally
        //   11	20	422	java/lang/Exception
        //   20	26	435	java/lang/Exception
        //   26	87	452	java/lang/Exception
        //   198	252	452	java/lang/Exception
    }

    /* Error */
    public void b(Context paramContext)
    {
        // Byte code:
        //   0: aconst_null
        //   1: astore 5
        //   3: aconst_null
        //   4: astore 6
        //   6: new 268	java/util/ArrayList
        //   9: dup
        //   10: invokespecial 269	java/util/ArrayList:<init>	()V
        //   13: astore 7
        //   15: new 33	com/popularapp/periodcalendar/a/d
        //   18: dup
        //   19: aload_1
        //   20: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   23: astore_3
        //   24: aload_3
        //   25: invokevirtual 40	com/popularapp/periodcalendar/a/d:getReadableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   28: astore_2
        //   29: new 17	java/lang/StringBuilder
        //   32: dup
        //   33: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   36: ldc_w 361
        //   39: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   42: aload_1
        //   43: invokestatic 319	com/popularapp/periodcalendar/a/a:f	(Landroid/content/Context;)I
        //   46: invokevirtual 27	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
        //   49: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   52: astore 4
        //   54: aload_2
        //   55: ldc -108
        //   57: iconst_1
        //   58: anewarray 170	java/lang/String
        //   61: dup
        //   62: iconst_0
        //   63: ldc 116
        //   65: aastore
        //   66: aload 4
        //   68: aconst_null
        //   69: aconst_null
        //   70: aconst_null
        //   71: aconst_null
        //   72: invokevirtual 365	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   75: astore 4
        //   77: aload 4
        //   79: ifnull +82 -> 161
        //   82: ldc 15
        //   84: astore 5
        //   86: aload 4
        //   88: invokeinterface 54 1 0
        //   93: ifeq +62 -> 155
        //   96: aload 4
        //   98: iconst_0
        //   99: invokeinterface 211 2 0
        //   104: astore 6
        //   106: aload 7
        //   108: aload 6
        //   110: invokevirtual 368	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
        //   113: ifne -27 -> 86
        //   116: aload 7
        //   118: aload 6
        //   120: invokevirtual 272	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   123: pop
        //   124: new 17	java/lang/StringBuilder
        //   127: dup
        //   128: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   131: aload 5
        //   133: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   136: aload 6
        //   138: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   141: ldc_w 323
        //   144: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   147: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   150: astore 5
        //   152: goto -66 -> 86
        //   155: aload_1
        //   156: aload 5
        //   158: invokestatic 371	com/popularapp/periodcalendar/a/a:n	(Landroid/content/Context;Ljava/lang/String;)V
        //   161: aload 4
        //   163: ifnull +20 -> 183
        //   166: aload 4
        //   168: invokeinterface 185 1 0
        //   173: ifne +10 -> 183
        //   176: aload 4
        //   178: invokeinterface 61 1 0
        //   183: aload_2
        //   184: ifnull +7 -> 191
        //   187: aload_2
        //   188: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   191: aload_3
        //   192: ifnull +7 -> 199
        //   195: aload_3
        //   196: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   199: return
        //   200: astore 4
        //   202: aconst_null
        //   203: astore_2
        //   204: aconst_null
        //   205: astore_3
        //   206: aload 6
        //   208: astore 5
        //   210: aload 4
        //   212: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   215: aload_1
        //   216: instanceof 68
        //   219: ifeq +50 -> 269
        //   222: aload_1
        //   223: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   226: aload 4
        //   228: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   231: aload_2
        //   232: ifnull +18 -> 250
        //   235: aload_2
        //   236: invokeinterface 185 1 0
        //   241: ifne +9 -> 250
        //   244: aload_2
        //   245: invokeinterface 61 1 0
        //   250: aload 5
        //   252: ifnull +8 -> 260
        //   255: aload 5
        //   257: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   260: aload_3
        //   261: ifnull -62 -> 199
        //   264: aload_3
        //   265: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   268: return
        //   269: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   272: aload_1
        //   273: ldc 78
        //   275: bipush 15
        //   277: aload 4
        //   279: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   282: aload_1
        //   283: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   286: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   289: goto -58 -> 231
        //   292: astore_1
        //   293: aload_2
        //   294: astore 4
        //   296: aload 5
        //   298: astore_2
        //   299: aload 4
        //   301: ifnull +20 -> 321
        //   304: aload 4
        //   306: invokeinterface 185 1 0
        //   311: ifne +10 -> 321
        //   314: aload 4
        //   316: invokeinterface 61 1 0
        //   321: aload_2
        //   322: ifnull +7 -> 329
        //   325: aload_2
        //   326: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   329: aload_3
        //   330: ifnull +7 -> 337
        //   333: aload_3
        //   334: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   337: aload_1
        //   338: athrow
        //   339: astore_1
        //   340: aconst_null
        //   341: astore_2
        //   342: aconst_null
        //   343: astore_3
        //   344: aload 5
        //   346: astore 4
        //   348: goto -49 -> 299
        //   351: astore_1
        //   352: aconst_null
        //   353: astore_2
        //   354: aload 5
        //   356: astore 4
        //   358: goto -59 -> 299
        //   361: astore_1
        //   362: aload 5
        //   364: astore 4
        //   366: goto -67 -> 299
        //   369: astore_1
        //   370: goto -71 -> 299
        //   373: astore 4
        //   375: aconst_null
        //   376: astore_2
        //   377: aload 6
        //   379: astore 5
        //   381: goto -171 -> 210
        //   384: astore 4
        //   386: aconst_null
        //   387: astore 6
        //   389: aload_2
        //   390: astore 5
        //   392: aload 6
        //   394: astore_2
        //   395: goto -185 -> 210
        //   398: astore 7
        //   400: aload 4
        //   402: astore 6
        //   404: aload_2
        //   405: astore 5
        //   407: aload 7
        //   409: astore 4
        //   411: aload 6
        //   413: astore_2
        //   414: goto -204 -> 210
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	417	0	this	e
        //   0	417	1	paramContext	Context
        //   28	386	2	localObject1	Object
        //   23	321	3	locald	d
        //   52	125	4	localObject2	Object
        //   200	78	4	localException1	Exception
        //   294	71	4	localObject3	Object
        //   373	1	4	localException2	Exception
        //   384	17	4	localException3	Exception
        //   409	1	4	localException4	Exception
        //   1	405	5	localObject4	Object
        //   4	408	6	localObject5	Object
        //   13	104	7	localArrayList	ArrayList
        //   398	10	7	localException5	Exception
        // Exception table:
        //   from	to	target	type
        //   15	24	200	java/lang/Exception
        //   210	231	292	finally
        //   269	289	292	finally
        //   15	24	339	finally
        //   24	29	351	finally
        //   29	77	361	finally
        //   86	152	369	finally
        //   155	161	369	finally
        //   24	29	373	java/lang/Exception
        //   29	77	384	java/lang/Exception
        //   86	152	398	java/lang/Exception
        //   155	161	398	java/lang/Exception
    }

    /* Error */
    public void b(Context paramContext, Pill paramPill)
    {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: invokestatic 160	com/popularapp/periodcalendar/notification/e:a	()Lcom/popularapp/periodcalendar/notification/e;
        //   5: aload_1
        //   6: aload_2
        //   7: invokevirtual 374	com/popularapp/periodcalendar/pill/Pill:d	()J
        //   10: invokevirtual 282	com/popularapp/periodcalendar/notification/e:a	(Landroid/content/Context;J)V
        //   13: new 33	com/popularapp/periodcalendar/a/d
        //   16: dup
        //   17: aload_1
        //   18: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   21: astore_3
        //   22: aload_3
        //   23: invokevirtual 93	com/popularapp/periodcalendar/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   26: astore 4
        //   28: new 95	android/content/ContentValues
        //   31: dup
        //   32: invokespecial 96	android/content/ContentValues:<init>	()V
        //   35: astore 5
        //   37: aload 5
        //   39: ldc -26
        //   41: aload_2
        //   42: invokevirtual 155	com/popularapp/periodcalendar/pill/Pill:i	()I
        //   45: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   48: invokevirtual 141	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
        //   51: aload 5
        //   53: ldc -22
        //   55: aload_2
        //   56: invokevirtual 377	com/popularapp/periodcalendar/pill/Pill:j	()J
        //   59: invokestatic 110	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   62: invokevirtual 114	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
        //   65: aload 5
        //   67: ldc -17
        //   69: aload_2
        //   70: invokevirtual 380	com/popularapp/periodcalendar/pill/Pill:k	()J
        //   73: invokestatic 110	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   76: invokevirtual 114	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
        //   79: aload 5
        //   81: ldc -113
        //   83: aload_2
        //   84: invokevirtual 146	com/popularapp/periodcalendar/pill/Pill:n	()I
        //   87: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   90: invokevirtual 141	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
        //   93: aload 5
        //   95: ldc -11
        //   97: aload_2
        //   98: invokevirtual 382	com/popularapp/periodcalendar/pill/Pill:a	()Ljava/lang/String;
        //   101: invokevirtual 122	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
        //   104: aload 4
        //   106: ldc -108
        //   108: aload 5
        //   110: new 17	java/lang/StringBuilder
        //   113: dup
        //   114: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   117: ldc_w 300
        //   120: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   123: aload_2
        //   124: invokevirtual 374	com/popularapp/periodcalendar/pill/Pill:d	()J
        //   127: invokevirtual 179	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   130: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   133: aconst_null
        //   134: invokevirtual 304	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   137: pop
        //   138: aload 4
        //   140: ifnull +8 -> 148
        //   143: aload 4
        //   145: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   148: aload_3
        //   149: ifnull +7 -> 156
        //   152: aload_3
        //   153: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   156: invokestatic 160	com/popularapp/periodcalendar/notification/e:a	()Lcom/popularapp/periodcalendar/notification/e;
        //   159: aload_1
        //   160: iconst_1
        //   161: invokevirtual 163	com/popularapp/periodcalendar/notification/e:a	(Landroid/content/Context;Z)V
        //   164: aload_0
        //   165: monitorexit
        //   166: return
        //   167: astore 4
        //   169: aconst_null
        //   170: astore_2
        //   171: aconst_null
        //   172: astore_3
        //   173: aload 4
        //   175: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   178: aload_1
        //   179: instanceof 68
        //   182: ifeq +36 -> 218
        //   185: aload_1
        //   186: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   189: aload 4
        //   191: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   194: aload_2
        //   195: ifnull +7 -> 202
        //   198: aload_2
        //   199: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   202: aload_3
        //   203: ifnull -47 -> 156
        //   206: aload_3
        //   207: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   210: goto -54 -> 156
        //   213: astore_1
        //   214: aload_0
        //   215: monitorexit
        //   216: aload_1
        //   217: athrow
        //   218: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   221: aload_1
        //   222: ldc 78
        //   224: bipush 10
        //   226: aload 4
        //   228: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   231: aload_1
        //   232: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   235: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   238: goto -44 -> 194
        //   241: astore_1
        //   242: aload_2
        //   243: ifnull +7 -> 250
        //   246: aload_2
        //   247: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   250: aload_3
        //   251: ifnull +7 -> 258
        //   254: aload_3
        //   255: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   258: aload_1
        //   259: athrow
        //   260: astore_1
        //   261: aconst_null
        //   262: astore_2
        //   263: aconst_null
        //   264: astore_3
        //   265: goto -23 -> 242
        //   268: astore_1
        //   269: aconst_null
        //   270: astore_2
        //   271: goto -29 -> 242
        //   274: astore_1
        //   275: aload 4
        //   277: astore_2
        //   278: goto -36 -> 242
        //   281: astore 4
        //   283: aconst_null
        //   284: astore_2
        //   285: goto -112 -> 173
        //   288: astore 5
        //   290: aload 4
        //   292: astore_2
        //   293: aload 5
        //   295: astore 4
        //   297: goto -124 -> 173
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	300	0	this	e
        //   0	300	1	paramContext	Context
        //   0	300	2	paramPill	Pill
        //   21	244	3	locald	d
        //   26	118	4	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
        //   167	109	4	localException1	Exception
        //   281	10	4	localException2	Exception
        //   295	1	4	localObject	Object
        //   35	74	5	localContentValues	android.content.ContentValues
        //   288	6	5	localException3	Exception
        // Exception table:
        //   from	to	target	type
        //   13	22	167	java/lang/Exception
        //   2	13	213	finally
        //   143	148	213	finally
        //   152	156	213	finally
        //   156	164	213	finally
        //   198	202	213	finally
        //   206	210	213	finally
        //   246	250	213	finally
        //   254	258	213	finally
        //   258	260	213	finally
        //   173	194	241	finally
        //   218	238	241	finally
        //   13	22	260	finally
        //   22	28	268	finally
        //   28	138	274	finally
        //   22	28	281	java/lang/Exception
        //   28	138	288	java/lang/Exception
    }

    public ArrayList<Pill> c(Context paramContext, int paramInt)
    {
        try
        {
            paramContext = a(paramContext, "select * from pill where uid=" + paramInt + " and " + "notification_switch" + "!=" + 2 + " and " + "classify" + " = " + 1, false);
            return paramContext;
        }
        finally
        {
            paramContext = finally;
            throw paramContext;
        }
    }

    /* Error */
    public void c(Context paramContext, Pill paramPill)
    {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: new 33	com/popularapp/periodcalendar/a/d
        //   5: dup
        //   6: aload_1
        //   7: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   10: astore_3
        //   11: aload_3
        //   12: invokevirtual 93	com/popularapp/periodcalendar/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   15: astore 4
        //   17: new 95	android/content/ContentValues
        //   20: dup
        //   21: invokespecial 96	android/content/ContentValues:<init>	()V
        //   24: astore 5
        //   26: aload 5
        //   28: ldc 98
        //   30: aload_2
        //   31: invokevirtual 104	com/popularapp/periodcalendar/pill/Pill:e	()J
        //   34: invokestatic 110	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   37: invokevirtual 114	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
        //   40: aload 5
        //   42: ldc 116
        //   44: aload_2
        //   45: invokevirtual 119	com/popularapp/periodcalendar/pill/Pill:f	()Ljava/lang/String;
        //   48: invokevirtual 122	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
        //   51: aload 5
        //   53: ldc -127
        //   55: aload_2
        //   56: invokevirtual 133	com/popularapp/periodcalendar/pill/Pill:q	()I
        //   59: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   62: invokevirtual 141	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
        //   65: aload 5
        //   67: ldc 124
        //   69: aload_2
        //   70: invokevirtual 127	com/popularapp/periodcalendar/pill/Pill:g	()J
        //   73: invokestatic 110	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   76: invokevirtual 114	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
        //   79: aload 5
        //   81: ldc -34
        //   83: aload_2
        //   84: invokevirtual 385	com/popularapp/periodcalendar/pill/Pill:h	()Ljava/lang/String;
        //   87: invokevirtual 122	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
        //   90: aload 5
        //   92: ldc -30
        //   94: aload_2
        //   95: invokevirtual 387	com/popularapp/periodcalendar/pill/Pill:r	()Ljava/lang/String;
        //   98: invokevirtual 122	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
        //   101: aload 5
        //   103: ldc -26
        //   105: aload_2
        //   106: invokevirtual 155	com/popularapp/periodcalendar/pill/Pill:i	()I
        //   109: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   112: invokevirtual 141	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
        //   115: aload 5
        //   117: ldc -22
        //   119: aload_2
        //   120: invokevirtual 377	com/popularapp/periodcalendar/pill/Pill:j	()J
        //   123: invokestatic 110	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   126: invokevirtual 114	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
        //   129: aload 5
        //   131: ldc -17
        //   133: aload_2
        //   134: invokevirtual 380	com/popularapp/periodcalendar/pill/Pill:k	()J
        //   137: invokestatic 110	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   140: invokevirtual 114	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Long;)V
        //   143: aload 5
        //   145: ldc -113
        //   147: aload_2
        //   148: invokevirtual 146	com/popularapp/periodcalendar/pill/Pill:n	()I
        //   151: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   154: invokevirtual 141	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
        //   157: aload 5
        //   159: ldc -11
        //   161: aload_2
        //   162: invokevirtual 390	com/popularapp/periodcalendar/pill/Pill:o	()Ljava/lang/String;
        //   165: invokevirtual 122	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/String;)V
        //   168: aload 4
        //   170: ldc -108
        //   172: aload 5
        //   174: new 17	java/lang/StringBuilder
        //   177: dup
        //   178: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   181: ldc_w 300
        //   184: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   187: aload_2
        //   188: invokevirtual 374	com/popularapp/periodcalendar/pill/Pill:d	()J
        //   191: invokevirtual 179	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   194: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   197: aconst_null
        //   198: invokevirtual 304	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   201: pop
        //   202: aload 4
        //   204: ifnull +8 -> 212
        //   207: aload 4
        //   209: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   212: aload_3
        //   213: ifnull +7 -> 220
        //   216: aload_3
        //   217: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   220: aload_0
        //   221: monitorexit
        //   222: return
        //   223: astore 4
        //   225: aconst_null
        //   226: astore_2
        //   227: aconst_null
        //   228: astore_3
        //   229: aload 4
        //   231: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   234: aload_1
        //   235: instanceof 68
        //   238: ifeq +36 -> 274
        //   241: aload_1
        //   242: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   245: aload 4
        //   247: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   250: aload_2
        //   251: ifnull +7 -> 258
        //   254: aload_2
        //   255: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   258: aload_3
        //   259: ifnull -39 -> 220
        //   262: aload_3
        //   263: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   266: goto -46 -> 220
        //   269: astore_1
        //   270: aload_0
        //   271: monitorexit
        //   272: aload_1
        //   273: athrow
        //   274: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   277: aload_1
        //   278: ldc 78
        //   280: bipush 11
        //   282: aload 4
        //   284: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   287: aload_1
        //   288: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   291: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   294: goto -44 -> 250
        //   297: astore_1
        //   298: aload_2
        //   299: ifnull +7 -> 306
        //   302: aload_2
        //   303: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   306: aload_3
        //   307: ifnull +7 -> 314
        //   310: aload_3
        //   311: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   314: aload_1
        //   315: athrow
        //   316: astore_1
        //   317: aconst_null
        //   318: astore_2
        //   319: aconst_null
        //   320: astore_3
        //   321: goto -23 -> 298
        //   324: astore_1
        //   325: aconst_null
        //   326: astore_2
        //   327: goto -29 -> 298
        //   330: astore_1
        //   331: aload 4
        //   333: astore_2
        //   334: goto -36 -> 298
        //   337: astore 4
        //   339: aconst_null
        //   340: astore_2
        //   341: goto -112 -> 229
        //   344: astore 5
        //   346: aload 4
        //   348: astore_2
        //   349: aload 5
        //   351: astore 4
        //   353: goto -124 -> 229
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	356	0	this	e
        //   0	356	1	paramContext	Context
        //   0	356	2	paramPill	Pill
        //   10	311	3	locald	d
        //   15	193	4	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
        //   223	109	4	localException1	Exception
        //   337	10	4	localException2	Exception
        //   351	1	4	localObject	Object
        //   24	149	5	localContentValues	android.content.ContentValues
        //   344	6	5	localException3	Exception
        // Exception table:
        //   from	to	target	type
        //   2	11	223	java/lang/Exception
        //   207	212	269	finally
        //   216	220	269	finally
        //   254	258	269	finally
        //   262	266	269	finally
        //   302	306	269	finally
        //   310	314	269	finally
        //   314	316	269	finally
        //   229	250	297	finally
        //   274	294	297	finally
        //   2	11	316	finally
        //   11	17	324	finally
        //   17	202	330	finally
        //   11	17	337	java/lang/Exception
        //   17	202	344	java/lang/Exception
    }

    /* Error */
    public void d(Context paramContext, Pill paramPill)
    {
        // Byte code:
        //   0: aload_0
        //   1: monitorenter
        //   2: invokestatic 160	com/popularapp/periodcalendar/notification/e:a	()Lcom/popularapp/periodcalendar/notification/e;
        //   5: aload_1
        //   6: aload_2
        //   7: invokevirtual 374	com/popularapp/periodcalendar/pill/Pill:d	()J
        //   10: invokevirtual 282	com/popularapp/periodcalendar/notification/e:a	(Landroid/content/Context;J)V
        //   13: new 33	com/popularapp/periodcalendar/a/d
        //   16: dup
        //   17: aload_1
        //   18: invokespecial 36	com/popularapp/periodcalendar/a/d:<init>	(Landroid/content/Context;)V
        //   21: astore_3
        //   22: aload_3
        //   23: invokevirtual 93	com/popularapp/periodcalendar/a/d:getWritableDatabase	()Landroid/database/sqlite/SQLiteDatabase;
        //   26: astore 4
        //   28: new 95	android/content/ContentValues
        //   31: dup
        //   32: invokespecial 96	android/content/ContentValues:<init>	()V
        //   35: astore 5
        //   37: aload 5
        //   39: ldc -26
        //   41: aload_2
        //   42: invokevirtual 155	com/popularapp/periodcalendar/pill/Pill:i	()I
        //   45: invokestatic 138	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   48: invokevirtual 141	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
        //   51: aload 4
        //   53: ldc -108
        //   55: aload 5
        //   57: new 17	java/lang/StringBuilder
        //   60: dup
        //   61: invokespecial 18	java/lang/StringBuilder:<init>	()V
        //   64: ldc_w 300
        //   67: invokevirtual 24	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   70: aload_2
        //   71: invokevirtual 374	com/popularapp/periodcalendar/pill/Pill:d	()J
        //   74: invokevirtual 179	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
        //   77: invokevirtual 31	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   80: aconst_null
        //   81: invokevirtual 304	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
        //   84: pop
        //   85: aload 4
        //   87: ifnull +8 -> 95
        //   90: aload 4
        //   92: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   95: aload_3
        //   96: ifnull +7 -> 103
        //   99: aload_3
        //   100: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   103: invokestatic 160	com/popularapp/periodcalendar/notification/e:a	()Lcom/popularapp/periodcalendar/notification/e;
        //   106: aload_1
        //   107: iconst_1
        //   108: invokevirtual 163	com/popularapp/periodcalendar/notification/e:a	(Landroid/content/Context;Z)V
        //   111: aload_0
        //   112: monitorexit
        //   113: return
        //   114: astore 4
        //   116: aconst_null
        //   117: astore_2
        //   118: aconst_null
        //   119: astore_3
        //   120: aload 4
        //   122: invokevirtual 66	java/lang/Exception:printStackTrace	()V
        //   125: aload_1
        //   126: instanceof 68
        //   129: ifeq +36 -> 165
        //   132: aload_1
        //   133: checkcast 68	com/popularapp/periodcalendar/BaseActivity
        //   136: aload 4
        //   138: invokevirtual 71	com/popularapp/periodcalendar/BaseActivity:a	(Ljava/lang/Exception;)V
        //   141: aload_2
        //   142: ifnull +7 -> 149
        //   145: aload_2
        //   146: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   149: aload_3
        //   150: ifnull -47 -> 103
        //   153: aload_3
        //   154: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   157: goto -54 -> 103
        //   160: astore_1
        //   161: aload_0
        //   162: monitorexit
        //   163: aload_1
        //   164: athrow
        //   165: invokestatic 76	com/popularapp/periodcalendar/utils/r:a	()Lcom/popularapp/periodcalendar/utils/r;
        //   168: aload_1
        //   169: ldc 78
        //   171: bipush 12
        //   173: aload 4
        //   175: invokestatic 83	com/popularapp/periodcalendar/utils/l:a	()Lcom/popularapp/periodcalendar/utils/l;
        //   178: aload_1
        //   179: invokevirtual 86	com/popularapp/periodcalendar/utils/l:a	(Landroid/content/Context;)Ljava/lang/String;
        //   182: invokevirtual 89	com/popularapp/periodcalendar/utils/r:a	(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;)V
        //   185: goto -44 -> 141
        //   188: astore_1
        //   189: aload_2
        //   190: ifnull +7 -> 197
        //   193: aload_2
        //   194: invokevirtual 62	android/database/sqlite/SQLiteDatabase:close	()V
        //   197: aload_3
        //   198: ifnull +7 -> 205
        //   201: aload_3
        //   202: invokevirtual 63	com/popularapp/periodcalendar/a/d:close	()V
        //   205: aload_1
        //   206: athrow
        //   207: astore_1
        //   208: aconst_null
        //   209: astore_2
        //   210: aconst_null
        //   211: astore_3
        //   212: goto -23 -> 189
        //   215: astore_1
        //   216: aconst_null
        //   217: astore_2
        //   218: goto -29 -> 189
        //   221: astore_1
        //   222: aload 4
        //   224: astore_2
        //   225: goto -36 -> 189
        //   228: astore 4
        //   230: aconst_null
        //   231: astore_2
        //   232: goto -112 -> 120
        //   235: astore 5
        //   237: aload 4
        //   239: astore_2
        //   240: aload 5
        //   242: astore 4
        //   244: goto -124 -> 120
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	247	0	this	e
        //   0	247	1	paramContext	Context
        //   0	247	2	paramPill	Pill
        //   21	191	3	locald	d
        //   26	65	4	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
        //   114	109	4	localException1	Exception
        //   228	10	4	localException2	Exception
        //   242	1	4	localObject	Object
        //   35	21	5	localContentValues	android.content.ContentValues
        //   235	6	5	localException3	Exception
        // Exception table:
        //   from	to	target	type
        //   13	22	114	java/lang/Exception
        //   2	13	160	finally
        //   90	95	160	finally
        //   99	103	160	finally
        //   103	111	160	finally
        //   145	149	160	finally
        //   153	157	160	finally
        //   193	197	160	finally
        //   201	205	160	finally
        //   205	207	160	finally
        //   120	141	188	finally
        //   165	185	188	finally
        //   13	22	207	finally
        //   22	28	215	finally
        //   28	85	221	finally
        //   22	28	228	java/lang/Exception
        //   28	85	235	java/lang/Exception
    }
}

