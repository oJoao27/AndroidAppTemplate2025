package com.gabriel.taskmaster.ui.ai

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gabriel.taskmaster.R
import com.gabriel.taskmaster.ui.ai.AiLogicFragment

class AiLogicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai_logic)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, AiLogicFragment())
                .commit()
        }
    }
}