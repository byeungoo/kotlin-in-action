package ch7

class Email
class Person6(val name: String) {

    private var _emails: List<Email>? = null
    val emails: List<Email>
        get() {
            if(_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }

    fun loadEmails(p: Person6): List<Email> {
        // email 얻어오기
        return listOf()
    }



}