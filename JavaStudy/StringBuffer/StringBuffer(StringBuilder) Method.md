### 생성자

- StringBuilder sb = new StringBuilder();
- StringBuilder sb = new StringBuilder("aaa");
-> 다음과 같이 문자열을 그냥 바로 넣을 수도 있다.


### 메서드

> **.append()**: 문자열을 추가한다. 

- sb.append("abc")
- sb.append(1);

> **.insert(int offset, String str)** : 문자열을 지정된 (offset)위치에 삽입한다.

- sb.insert(2, "abc")

> **.replace()** : 첫번째와 두번째 파라미터로 받는 숫자 인덱스에 위치한 문자열을 대체한다. 

- .replace(1, 2, "ye")

> **.substring(int start, (int end))**: 인덱싱. 파라미터가 하나라면 해당 인덱스부터 끝까지, 두개라면 시작점과 끝점-1 까지 인덱싱
- (sb.substring(5), sb.substring(3, 7))


> **.deleteCharAt(int index)**: 인덱스에 위치한 문자 하나를 삭제한다. 

- (sb.deleteCharAt(3))

> **.delete(int start, int end)**: start 부터 end-1 까지의 문자를 삭제한다. 

- (sb.delete(3, sb.length()))

> **.toString()**: String으로 변환한다. 

- (sb.toString())

> **.reverse()**: 해당 문자 전체를 뒤집는다. 

- (sb.reverse())

> **.setCharAt(int index, String s)**: index 위치의 문자를 s로 변경

> **.setLength(int len)**: 문자열 길이 조정, 현재 문자열보다 길게 조정하면 공백으로 채워짐, 현재 문자열보다 짧게 조정하면 나머지 문자는 삭제

> **.trimToSize()**: 문자열이 저장된 char[] 배열 사이즈를 현재 문자열 길이와 동일하게 조정, String 클래스의 trim()이 앞 뒤 공백을 제거하는 것과 같이 공백 사이즈를 제공하는 것, 배열의 남는 사이즈는 공백이므로, 문자열 뒷부분의 공백을 모두 제거해준다고 보면 됨