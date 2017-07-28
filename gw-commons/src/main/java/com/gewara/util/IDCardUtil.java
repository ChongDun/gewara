/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.collections.map.UnmodifiableMap;

public abstract class IDCardUtil {
	private static final String[] ValCodeArr = new String[] { "1", "0", "x", "9", "8", "7", "6", "5", "4", "3", "2" };
	private static final String[] Wi = new String[] { "7", "9", "10", "5", "8", "4", "2", "1", "6", "3", "7", "9", "10",
			"5", "8", "4", "2" };
	private static final Map<String, String> AREACODEMAP;

	public static String IDCardValidate(String IDStr) {
		String errorInfo = "";
		String Ai = "";
		if (IDStr.length() != 15 && IDStr.length() != 18) {
			errorInfo = "���֤���볤��Ӧ��Ϊ15λ��18λ��";
			return errorInfo;
		} else {
			if (IDStr.length() == 18) {
				Ai = IDStr.substring(0, 17);
			} else if (IDStr.length() == 15) {
				Ai = IDStr.substring(0, 6) + "19" + IDStr.substring(6, 15);
			}

			if (!isNumeric(Ai)) {
				errorInfo = "���֤15λ���붼ӦΪ���� ; 18λ��������һλ�⣬��ӦΪ���֡�";
				return errorInfo;
			} else {
				String strYear = Ai.substring(6, 10);
				String strMonth = Ai.substring(10, 12);
				String strDay = Ai.substring(12, 14);
				if (!isDate(strYear + "-" + strMonth + "-" + strDay)) {
					errorInfo = "���֤������Ч��";
					return errorInfo;
				} else {
					GregorianCalendar gc = new GregorianCalendar();
					SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

					try {
						if (gc.get(1) - Integer.parseInt(strYear) > 150 || gc.getTime().getTime()
								- s.parse(strYear + "-" + strMonth + "-" + strDay).getTime() < 0L) {
							errorInfo = "���֤���ղ�����Ч��Χ��";
							return errorInfo;
						}
					} catch (NumberFormatException arg11) {
						errorInfo = "���֤���ղ�����Ч��Χ��";
						return errorInfo;
					} catch (ParseException arg12) {
						errorInfo = "���֤���ղ�����Ч��Χ��";
						return errorInfo;
					}

					if (Integer.parseInt(strMonth) <= 12 && Integer.parseInt(strMonth) != 0) {
						if (Integer.parseInt(strDay) <= 31 && Integer.parseInt(strDay) != 0) {
							Map h = AREACODEMAP;
							if (h.get(Ai.substring(0, 2)) == null) {
								errorInfo = "���֤�����������";
								return errorInfo;
							} else {
								int TotalmulAiWi = 0;

								int modValue;
								for (modValue = 0; modValue < 17; ++modValue) {
									TotalmulAiWi += Integer.parseInt(String.valueOf(Ai.charAt(modValue)))
											* Integer.parseInt(Wi[modValue]);
								}

								modValue = TotalmulAiWi % 11;
								String strVerifyCode = ValCodeArr[modValue];
								Ai = Ai + strVerifyCode;
								if (IDStr.length() == 18) {
									if (!Ai.equals(IDStr)) {
										errorInfo = "���֤��Ч�����ǺϷ������֤����";
										return errorInfo;
									} else {
										return "";
									}
								} else {
									return "";
								}
							}
						} else {
							errorInfo = "���֤������Ч";
							return errorInfo;
						}
					} else {
						errorInfo = "���֤�·���Ч";
						return errorInfo;
					}
				}
			}
		}
	}

	private static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("[0-9]*");
		Matcher isNum = pattern.matcher(str);
		return isNum.matches();
	}

	public static boolean isDate(String strDate) {
		Pattern pattern = Pattern.compile(
				"^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
		Matcher m = pattern.matcher(strDate);
		return m.matches();
	}

	static {
		Hashtable areacodeTmp = new Hashtable();
		areacodeTmp.put("11", "����");
		areacodeTmp.put("12", "���");
		areacodeTmp.put("13", "�ӱ�");
		areacodeTmp.put("14", "ɽ��");
		areacodeTmp.put("15", "���ɹ�");
		areacodeTmp.put("21", "����");
		areacodeTmp.put("22", "����");
		areacodeTmp.put("23", "������");
		areacodeTmp.put("31", "�Ϻ�");
		areacodeTmp.put("32", "����");
		areacodeTmp.put("33", "�㽭");
		areacodeTmp.put("34", "����");
		areacodeTmp.put("35", "����");
		areacodeTmp.put("36", "����");
		areacodeTmp.put("37", "ɽ��");
		areacodeTmp.put("41", "����");
		areacodeTmp.put("42", "����");
		areacodeTmp.put("43", "����");
		areacodeTmp.put("44", "�㶫");
		areacodeTmp.put("45", "����");
		areacodeTmp.put("46", "����");
		areacodeTmp.put("50", "����");
		areacodeTmp.put("51", "�Ĵ�");
		areacodeTmp.put("52", "����");
		areacodeTmp.put("53", "����");
		areacodeTmp.put("54", "����");
		areacodeTmp.put("61", "����");
		areacodeTmp.put("62", "����");
		areacodeTmp.put("63", "�ຣ");
		areacodeTmp.put("64", "����");
		areacodeTmp.put("65", "�½�");
		areacodeTmp.put("71", "̨��");
		areacodeTmp.put("81", "���");
		areacodeTmp.put("82", "����");
		areacodeTmp.put("91", "����");
		AREACODEMAP = UnmodifiableMap.decorate(areacodeTmp);
	}
}