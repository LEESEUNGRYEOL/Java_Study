### 생성자

String str = "str";
String str = new String("str");

### 주요 메소드

> 1. length(): 문자열의 길이 (str.length())

> 2. isEmpty(): 문자열이 비어있는 지 확인, 문자열의 길이(length)가 0이면 true 반환(boolean형), 0이 아니면 false를 반환

> 3. charAt(int index): 문자 반환, 문자열 중 해당 인덱스의 문자(char형)를 반환합니다.(인덱스는 0 ~ 문자열의 길이(length) -1)

> 4. getChars: 문자 배열 복사, 문자열을 문자(char) 배열로 복사 (str.getChars(0, 2, ch, 0); // 시작 인덱스, 끝 인덱스, 복사 받을 char 배열 이름, 복사 시작 위치)
> 5. equals(String str2): 문자열 비교, 해당 문자열과 매개변수의 문자열이 같은 지 비교하여 true 또는 false를 반환합니다.(boolean형)

> 6. compareTo(String str2): 문자열 비교(사전 순으로 대소 비교), 해당 문자열과 매개변수의 문자열을 사전 순으로 비교
     반환값:
     str과 str2의 같을 경우 : 0
     str이 str2보다 사전 순으로 앞인 경우 : -1
     str이 str2보다 사전 순으로 뒤인 경우 : 1
* str의 마지막 문자열과 str2의 마지막 문자를 제외하고 같은 경우
  예 ) String str = new String("ccca"); String str2 = new String("cccz")
  str과 str2의 마지막 문자열을 비교하여 사전 순 차이만큼 반환 : -25

> 7. .indexOf(String s): 해당 문자열이 위치하는 인덱스를 반환합니다.(int형) (해당 문자열이 존재하지 않으면 -1을 반환합니다.)

> 8. .lastIndexOf(String s) : 문자열 마지막 위치, 해당 문자열이 마지막으로 위치하는 인덱스를 반환합니다.(int형)

> 9. .substring(int start, (int end)): 문자열 자르기, 해당 문자열의 인덱스만큼 잘라서 반환합니다.(String형), (매개 변수가 2개인 경우 : 해당 범위만큼 자름, 1개인 경우 :
     앞에서부터 인덱스만큼 자름)

> 10. .aconcat(String str2): 문자열 합치기, 해당 문자열 뒤에 매개변수 문자열을 서로 합칩니다. 

> 11. .replace(String s1, String s2): 문자열 치환, 해당 문자를 찾아 다음 문자로 변경 

> 12. .contains(String str2): 문자열 포함, 해당 문자열이 포함되어 있는지 확인합니다. 포함할 경우 true, 아닌 경우 false 반환(boolean형)

> 13. .split(String s): 문자열 분리, 문자열을 해당 문자열을 기준으로 모두 분리합니다.(String [] 반환)

> 14. .trim(): 문자열 공백 제거, 해당 문자열의 앞, 뒤의 공백을 모두 제거합니다.(문자열 사이의 공백은 제거되지 않음)

> 15. .toUpperCase()/.toLowerCase(): 문자열 전체 대문자/소문자 변환