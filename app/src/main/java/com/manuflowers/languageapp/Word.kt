package com.manuflowers.languageapp

class Word(private var miwokTranslation: String, private var defaultTranslation: String) {

    fun word(miwokTranslation: String, defaultTranslation: String) {
        this.miwokTranslation = miwokTranslation
        this.defaultTranslation = defaultTranslation
    }

    fun getmiwokTranslation(): String {
        return miwokTranslation
    }

    fun getDefaultTranslation(): String {
        return defaultTranslation
    }
}