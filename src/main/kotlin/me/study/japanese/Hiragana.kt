package me.study.japanese

import org.springframework.stereotype.Service

@Service
class Hiragana : Japaness {

    fun getword() : MutableMap<String,String>
    {
        val word : MutableMap<String,String> = mutableMapOf()
        word["あ"] = "아"
        word["い"] = "이"
        word["う"] = "우"
        word["え"] = "에"
        word["お"] = "오"

        word["か"] = "카"
        word["き"] = "키"
        word["く"] = "쿠"
        word["け"] = "케"
        word["こ"] = "코"

        word["さ"] = "사"
        word["し"] = "시"
        word["す"] = "스"
        word["せ"] = "세"
        word["そ"] = "소"

        word["た"] = "타"
        word["ち"] = "치"
        word["つ"] = "츠"
        word["て"] = "테"
        word["と"] = "토"

        word["な"] = "나"
        word["に"] = "니"
        word["ぬ"] = "누"
        word["ね"] = "네"
        word["の"] = "노"

        word["は"] = "하"
        word["ひ"] = "히"
        word["ふ"] = "후"
        word["へ"] = "헤"
        word["ほ"] = "호"

        word["ま"] = "마"
        word["み"] = "미"
        word["む"] = "무"
        word["め"] = "메"
        word["も"] = "모"

        word["や"] = "야"
        word["ゆ"] = "유"
        word["よ"] = "요"

        word["ら"] = "라"
        word["り"] = "리"
        word["る"] = "루"
        word["れ"] = "레"
        word["ろ "] = "로"

        word["わ"] = "와"
        word["を"] = "오"
        word["ん "] = "응"
        return word
    }
}