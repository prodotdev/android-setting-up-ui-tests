package dev.protrack.uitestapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test


class GetUserTest {
    @get:Rule
    val composeTestRule = createComposeRule()

   @Test
   fun it_shows_user_name() {
       composeTestRule.setContent {
           HomeScreen()
       }

       composeTestRule.onNodeWithText("Real User").assertIsDisplayed()
   }
}