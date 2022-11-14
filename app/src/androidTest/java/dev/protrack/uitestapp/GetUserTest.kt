package dev.protrack.uitestapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import io.mockk.every
import io.mockk.verify
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class GetUserTest {

    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeTestRule = createAndroidComposeRule<MainActivity>()

   @Test
   fun it_shows_user_name() {
       every { mockAuthService.fetchUser() } returns "Fake User"

       composeTestRule.setContent {
           HomeScreen()
       }

       composeTestRule.onNodeWithText("Fake User").assertIsDisplayed()

       verify {
           mockAuthService.fetchUser()
       }
   }
}