package com.lec.java.regexp03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 정규표현식 에 사용하는 각종 표현식들
 * 	정규표현식		설명
 * 	^			문자열 시작
 * 	$			문자열 종료
 * 	.			임의의 문자 [단 ‘'는 넣을 수 없습니다.]
 * 	*			앞 문자가 0개 이상의 개수가 존재할 수 있습니다.
 * 	+			앞 문자가 1개 이상의 개수가 존재할 수 있습니다.
 * 	?			앞 문자가 없거나 하나 있을 수 있습니다.
 * []			문자의 집합이나 범위를 표현합니다. -기호를 통해 범위를 나타낼 수 있습니다. ^가 존재하면 not을 나타냅니다.
 * {}			횟수 또는 범위를 나타냅니다.
 * ()			괄호안의 문자를 하나의 문자로 인식합니다. (그룹)
 * |			패턴을 OR 연산을 수행할 때 사용합니다.
 * \s			공백 문자
 * \S			공백 문자가 아닌 나머지 문자
 * \w			알파벳이나 숫자
 * \W			알파벳이나 숫자를 제외한 문자
 * \d			[0-9] 숫자
 * \D			숫자를 제외한 모든 문자
 * (?i)			대소문자를 구분하지 않습니다.
 * 
 * 
 * 자바 정규표현식에 사용되는 escaped character 들
 *    \.[]{}()<>*+-=!?^$|
 */
public class RegExp03Main {

	public static void main(String[] args) {
		System.out.println("정규표현식\n");

		String regex, intput, title;
		String [] arrInput;

		//─────────────────────────────────────────
		title = "^ : 바로 문자뒤의 문자열로 시작됨";
		regex = "^The"; // The 로 시작하는 문자열 패턴
		arrInput = new String[] {
				"The Things",            // o
				"On The Things",        // x
				" The The The",            // x
				"There you go"            // o
		};

		//─────────────────────────────────────────
		title = "$ : 문자열의 마지막이 이 문자열로 마무리 됨";
		regex = "Man$"; // Man으로 끝나는 문자열 패턴
		arrInput = new String[] {
				"SuperMan",                // o
				"AquaMan",                // o
				"WonderWoman",            // x
				"WonderWoMan",            // o
				"PostMan "                // x
		};

		//─────────────────────────────────────────
		title = "^표현식$ : 정확하게 전체패턴매칭되는 문자열";
		regex = "^SuperMan$";
		arrInput = new String[] {
				"SuperMan",             // o
				"Super Man",            // x
				" SuperMan",            // x
				"SuperMan "                // x
		};

		//─────────────────────────────────────────
		title = " . : 어떤 문자든지 임의의 '한문자'를 말한다.꼭 하나의 문자와 매칭";
		regex = "x.z";
		arrInput = new String[] {
				"xyz",                  // xyz
				"xxzdfdk",              // xxz
				"aa10x9zbxbz",          // x9z xbz
				"xz",                      //
				"90x zxx_zdf",          // x z x_z
				"xbz",                    // xbz
				"xyyz"                   //
		};

		//─────────────────────────────────────────
		title = " * : 바로 앞의 문자가 없거나 한개 이상의 경우를 매칭";
		regex = "ab*";
		arrInput = new String[] {
				"a",                      // a
				"abc",                     // ab
				"ab",                     // ab
				"abbbaaaabababbab",     // abbb a a a ab ab abb ab
				"bbba",                  // a
				"cdef"                  //
		};

		//─────────────────────────────────────────
		title = " + : 바로 앞의 문자를 나타내면 꼭 한개 혹은 그 이상을 매칭";
		regex = "ab+";
		arrInput = new String[] {
				"a",                      //
				"abc",                     // ab
				"ab",                     // ab
				"abbbaaaabababbab",     // abbb ab ab abb ab
				"bbba",                  //
				"cdef"                  //
		};

		//─────────────────────────────────────────
		title = " ? : 바로 앞의 문자가 한개 있거나 없는것을 매칭";
		regex = "ab?";
		arrInput = new String[] {
				"a",                      // a
				"abc",                  // ab
				"kkabcc",                  // ab
				"abbbaaaabababbab",     // ab a a a ab ab ab ab
				"bbba"                  // a
		};

		//─────────────────────────────────────────
		title = " [] : 안에 존재하는 문자들중 한 문자만을 매칭";
		regex = "[abc]"; // a 또는 b 또는 c 중에 한문자 매칭
		arrInput = new String[] {
				"able",                 // a b
				"bible",                  // b b
				"cable",                  // c a b
				"xenosys",                 //
		};

		regex = "[abc]+";    // a, b, c 조합의 연속✔️✔️✔️
		arrInput = new String[] {
				"able",                 // ab
				"bible",                  // b b
				"cable",                  // cab
				"xenosys",                 //
		};

		regex = "[a-z]+";    // 소문자들의 연속 ✔️✔️✔️
		arrInput = new String[] {
				"able",                 // able
				"bible",                  // bible
				"cable",                  // cable
				"xenosys",                 // xenosys
		};

		arrInput = new String[] {
				"abc100",                        // abc
				"abcDefGHIUJ-KLM123opQrstuz"    // abc ef op rstuz
		};

		regex = "[a-zA-Z]+";
		arrInput = new String[] {
				"abc100",                        // abc
				"abcDefGHIUJ-KLM123opQrstuz"    // abcDefGHIUJ KLM opQrstuz
		};

		regex = "[a-zA-Z0-9]+";
		arrInput = new String[] {
				"abc100",                        // abc100
				"abcDefGHIUJ-KLM123opQrstuz"    // abcDefGHIUJ KLM123opQrstuz
		};

		regex = "[a-zA-Z0-9-]+";
		arrInput = new String[] {
				"abc100",                        // abc100
				"abcDefGHIUJ-KLM123opQrstuz"    // abcDefGHIUJ-KLM123opQrstuz
		};

		regex = "[0-9]+";
		arrInput = new String[] {
				"abc100",                        // 100
				"abcDefGHIUJ-KLM123opQrstuz"    // 123
		};

		//─────────────────────────────────────────
		title = " {} : 앞에 있는 문자나 문자열의 등장개수를 정함";
		regex = "ab{2}"; //a 한개, b 반드시 두개
		arrInput = new String[] {
				"abb",                     // abb
				"abbb",                 // abb
				"abbbabbbbbbbbabaabab",    // abb abb
		};

		regex = "ab{2,}";  // a한개, b의 개수가 2개 이상등장
		arrInput = new String[] {
				"abb",                     // abb
				"abbb",                 // abbb
				"abbbabbbbbbbbabaabab",    // abbb abbbbbbbb
		};

		regex = "ab{3,5}";  // b의 개수가 3개에서 5개까지
		arrInput = new String[] {
				"abb",                     //
				"abbb",                 // abbb
				"abbbabbbbbbbbabaabab",    // abbb abbbbb
		};

		// 프로젝트 내에서 printf, print, println 을 사용한 곳을 찾아보자?
		// Find in Files .. ctrl + shift + F
		// print[a-z]{1,2}  <- Regex 옵션 ON,  Case 옵션 ON

		//─────────────────────────────────────────
		title = " () : ()안에 있는 글자들을 그룹화 ";
		regex = "a(bc)*";  // a 다음에 (bc) 가 없거나 하나 이상
		arrInput = new String[] {
				"abc",               // abc
				"abcbcbbac",         // abcbc a
				"abcabcabc",         // abc abc abc
		};

		//─────────────────────────────────────────
		title = " | : OR 연산자  역할";
		regex = "a|b";
		arrInput = new String[] {
				"a",                // a
				"b",                // b
				"ab",               // a b
				"xyz"               //
		};

		regex = "(a|b)+";
		regex = "[(ab)]+";
		arrInput = new String[] {
				"a",                // a
				"b",                // b
				"ab",               // ab
				"xyz"               //
		};

		//─────────────────────────────────────────
		title = "(?i)  : 대소문자 구분안하고 매칭 ";  // 타 언어 정규표현식과 다름
		regex = "(?i)abc";
		arrInput = new String[] {
				"abc",				// abc
				"Abc",				// Abc
				"ABC",				// ABC ?  ---> (?i)는 입력문자열 전체에 영향! a뿐만 아니고~
		};

		//─────────────────────────────────────────
		title = "\\s : 공백,  \\S : 공백아닌 문자";  // 공백 : 띄어쓰기, \n, \t, \r ...
		regex = "\\s+";
		arrInput = new String[] {
				"Hello My World",				// 2덩이
				"He \tllo My World",			// 3덩이
				"\n\t Hello My World\n\n",		// 4덩이
		};

		regex = "\\S+";
		arrInput = new String[] {
				"Hello My World",				// Hello My World
				"He \tllo My World",			// He llo My World
				"\n\t Hello My World\n\n",		// Hello My World
		};

		//─────────────────────────────────────────
		title = "\\w : 알파벳이나 숫자, \\W 알파벳이나 숫자를 제외한 문자";
		regex = "\\w+";
		arrInput = new String[] {
				"This is 2022-11-23 !!"			// This is 2022 11 23
		};

		regex = "\\W+";
		arrInput = new String[] {
				"This is 2022-11-23 !!"			// 5덩이
		};


		//─────────────────────────────────────────
		title = "\\d : [0-9] 숫자, \\D 숫자를 제외한 모든 문자";
		regex = "\\d+";
		arrInput = new String[] {
				"This is 2022-11-23 !!"			// 2022 11 23
		};

		regex = "\\D+";
		arrInput = new String[] {
				"This is 2022-11-23 !!"			// This is , -, -,  !!
		};

		//─────────────────────────────────────────
		title = "escaped character 매칭 시키기";
		regex = ".+";   // 이렇게 하면 전체 문자에 매칭된다.
		arrInput = new String[] {
				"My name is .."
		};

		regex = "[.]+";		// 1. escaping
		arrInput = new String[] {
				"My name is .."
		};

		regex = "\\.+";		// 2. escaping
		arrInput = new String[] {
				"My name is .."
		};

		//*****************************************
		// 패턴매칭 수행
		System.out.println(title);
		regExpTest(regex, arrInput);

		System.out.println("프로그램 종료");
	} // end main()

	// 도우미 함수
	public static void regExpTest(String regex, String [] arrInput) {
		for(String input : arrInput) regExpTest(regex, input);
	}

	public static void regExpTest(String regex, String input) {
		System.out.println("[정규표현식 매칭 테스트]-----------------");
		System.out.println("정규표현식: " + regex);
		System.out.println("입력문자열: " + input);

		Matcher matcher = Pattern.compile(regex).matcher(input);
		int groupCount = matcher.groupCount();  // 그룹 개수

		int matchCount = 0;
		while(matcher.find()) {
			matchCount++;
			System.out.println("    매치" + matchCount + ": " + matcher.group() + " {" + matcher.start() + "~" + matcher.end() + "}");

			// 그룹이 있으면 group별 출력
			if(groupCount > 0) {
				for(int i = 0; i <= groupCount; i++) {     // i 범위 주목!
					System.out.printf("\t group(%d): %s {%d~%d}\n",
							i, matcher.group(i), matcher.start(i), matcher.end(i));
				}
			}

		} // end while
		if(matchCount == 0) System.out.println("   Ⅹ매치 없슴Ⅹ");
		System.out.println();
	} // end regExpTest()

} // end class
