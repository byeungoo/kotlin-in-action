package ch3

import java.lang.IllegalArgumentException

class User(val id : Int, val name: String, val address : String) {
    fun saveUser(user: User) {
        if(user.name.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id} : empty Name")
        }

        if(user.address.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id} : empty Address")
        }

        // user를 데이터베이스에 저장

    }

    fun refactorySaveUser(user: User, value: String, fieldName: String) {

        // 로컬 함수를 사용해 코드 중복 제거거
       fun validate(user: User, value: String, fieldName :String) {
            if(value.isEmpty()) {
                throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
            }
        }

        validate(user, user.name, "Name")
        validate(user, user.address, "Address")

        // user를 데이터베이스에 저장

    }

    // 로컬 함수는 자신이 속한 바깥 함수의 모든 파라미터와 변수 사용 가능
    fun refactorySaveUser2(user: User, value: String, fieldName: String) {

        // 로컬 함수를 사용해 코드 중복 제거거
        fun validate(value: String, fieldName :String) {
            if(value.isEmpty()) {
                throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
            }
        }

        validate(user.name, "Name")
        validate(user.address, "Address")

        // user를 데이터베이스에 저장

    }

    // 검증 로직을 확장 함수로 추출
    fun User.validateBeforeSave() {
        fun validate(value : String, fieldName: String) {
            if(value.isEmpty()) {
                throw IllegalArgumentException("Can't save user $id: empty $fieldName") // User의 프로퍼티 직접 사용 가능
            }
        }

        validate(name, "Name")
        validate(address, "Address")
    }

    fun saveUser2(user: User) {
        user.validateBeforeSave()   // 확장 함수를 호출한다.

        // user을 데이터베이스에 저장한다.
    }

}