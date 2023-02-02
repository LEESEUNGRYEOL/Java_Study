### 1. .asList(arr)

배열을 ArrayList로 변환해준다.
배열은 크기가 정해져있고 값의 삭제 등이 자유롭지 않아 불편한 점이 많다.
asList를 사용하여 리스트로 변환한 후 체인메소드(chain method) 방식으로 ArrayList의 메소드를 더하여 활용하면 여러모로 편리한 점이 많다.

### 2. .toString(arr): 배열에도 toString이 존재한다.

toString이라는 메소드는 클래스에서 ALT+SHIFT+S를 누른 후 Generate toString을 이용해 오버라이딩할 수 있다.

### 3. Sorting

#### sort(arr)

기본적으로 Sort()를 하면 오름차순 정렬이 된다. 정수형 배열을 내림차순 정렬하고 싶으면 반복문으로 배열을 뒤에서부터 꺼내 담아주거나 하는 방식을 사용

#### sort(arr, comparator)

Collections.reverseOrder() 라는 메소드가 있는데, sort의 첫번째 파라미터에 문자형 배열을 담고 두번째 파라미터에
Collections.reverseOrder() 를 담으면 문자형 배열을 내림차순 정렬해준다. (java.util.Collections)

#### sort(arr, int start, int end)

인덱스의 시작과 끝을 정해 start부터 end-1까지만 오름차순 정렬할 수도 있다.

#### sort(arr, int start, int end, comparator)

인덱스의 시작과 끝을 정해 start부터 end-1까지만 문자열 배열을 내림차순 정렬할 수도 있다.

#### .copyOf(arr2, int newlength)

배열을 복사한다. 파라미터로는 복사하고자 하는 배열과 새로운 배열의 크기가 들어간다.