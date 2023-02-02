## 생성자

### new ArrayList()

기본 크기가 10인 배열 생성

### new ArrayList(기본크기)

기본 크기를 지정 (배열이 다 차면 기본크기만큼 사이즈가 증가함)

### new ArrayList<제네릭>()

배열 값의 타입을 지정

## ※ 제네릭 (Generic)

- 컬렉션 객체를 생성할 때 저장되는 데이터의 타입을 미리 지정하는 기능
- 제네릭으로 지정한 타입 외에는 담길 수 없도록 함

## 주요 메소드

### .add((index), val)

순서대로 리스트를 추가, 배열 사이즈 초과 시 초기 설정된 사이즈만큼 자동으로 사이즈가 증가함, 인덱스를 추가로 지정해주면 해당 인덱스에 값을 삽입

### .get(index)

해당 인덱스의 값 반환

### .set(index, val)

인덱스로 값 변경

### .indexOf(val)

값을 제공하면 해당 값의 첫번째 인덱스를 반환

### .lastindexOf(val)

해당 값의 마지막 인덱스 반환

### .remove(index or val)

해당 인덱스의 값 or 해당 값 중 첫번째 값 삭제

### .contains(val)

해당 값이 배열에 있는지 검색해서 true / false 반환

### .containsAll(val1, val2...)

argument로 제공한 컬렉션의 모든 값이 포함되어 있는지 여부를 true / false로 반환

### .toArray()

ArrayList 타입의 인스턴스를 일반 배열 타입으로 반환, 저장할 배열 타입에 맞춰 자동 형변환, 배열 크기 또한 자동으로 맞춰서 바꿔줌

### .clear()

값 모두 삭제

### .isEmpty()

비었으면 true, 하나라도 값이 있으면 false 반환

### .addAll(arr2)

두 컬렉션을 합침

### .retainAll(arr2)

argument로 제공한 컬렉션 내에 들어있는 값을 제외하고 모두 지워줌

### .removeAll(arr2)

argument로 제공한 컬렉션 내에 들어있는 값과 일치하는 값을 모두 지워줌, retainAll() 메소드와 반대

### .size()

요소 개수 반환