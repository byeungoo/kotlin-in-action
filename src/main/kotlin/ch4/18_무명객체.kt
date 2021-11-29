package ch4

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

/**
 * 무명 객체 안에서 로컬 변수 선언
 */
fun countClicks(window: Window) {
    var clickCount = 0  // 로컬 변수 정의
    window.addMouseListener(object: MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            clickCount++    // 로컬 변수의 값 변경
        }
    })
}