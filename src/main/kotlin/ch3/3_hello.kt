package ch3

/**
 * 함수를 직접 소스 파일의 최상위 수준, 모든 다른 클래스의 밖에 위치하면 해당 함수가 정의된 패키지를 임포트해서 사용가능
 * 자바 클래스로 따지면 helloWorld를 static 메소드로 갖는 클래스가 생김. 여기서 클래스명은 파일명과 같음
 */
fun helloWorld() = "hello world"