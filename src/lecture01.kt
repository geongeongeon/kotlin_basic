fun main() {
    // var : 수정 가능한 변수
    var number1: Long = 10L // 타입 생략 시 컴파일러가 자동으로 추론

    // val : 수정 불가능한 변수
    val number2 = 10L

    // 초기값을 지정해주지 않는 경우 반드시 타입 명시
    // 값을 넣어주지 않고 사용하려고 하면 컴파일 에러

    // 변수에 null 값이 허용될 때 타입 뒤에 '?'를 추가
    var number3: Long? = null

    // 객체 생성 시에 new 키워드를 붙이지 않음
}