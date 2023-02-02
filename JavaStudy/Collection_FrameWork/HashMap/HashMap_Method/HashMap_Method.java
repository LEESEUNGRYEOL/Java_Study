package Collection_FrameWork.HashMap.HashMap_Method;

/*
#1. 생성자
Collection_FrameWork.HashMap <제네릭> map = new Collection_FrameWork.HashMap <키 제네릭, 값 제네릭>()
-> 기본 용량 16, 사용률 0.75의 빈 Collection_FrameWork.HashMap 생성

1). argument로 (int Capacity, float loadFactor)를 직접 지정할 수 있음
2). 용량은 해싱기법을 통해 분류되는 카테고리의 갯수라고 할 수 있음
3). 사용률은 전체 용량을 변경할 조건을 의미함 (75%가 차면 현재 용량의 2배로 용량 변경 등)


#2. 주요 메서드
1 ).put(키, 값): 키(Key)와 값(value)을 입력, 제네릭으로 지정한 타입에 맞는 일반 배열을 이용해 한번에 넣어줄 수 있음, 만약 중복되는 키값을 제공하면 기존 키가 가지고 있던 값을 제공된 값으로 변경함
2 ).keySet()/values(): 키 / 값을 별도로 추출하여 컬렉션 형태로 반환 (Set 생성)
3 ).get(키): 키값을 제공하면 해당 값을 반환
4 ).replace(키, 값): 키값과 바꿀 값을 제공하면 해당 키의 값을 변경함
5 ).containsKey()/.containsValue(): key / value가 존재하는지 여부 확인 후 true / false 반환
6 ).remove(키): 제공한 키값의 항목을 제거
7 ).clear(): 모두 삭제
*/



