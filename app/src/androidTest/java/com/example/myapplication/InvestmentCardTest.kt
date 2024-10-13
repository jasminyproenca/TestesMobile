import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.myapplication.ui.theme.InvestmentCard
import org.junit.Rule
import org.junit.Test

class InvestmentCardTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun investmentCardDisplaysCorrectInfo() {
        // Set up the composable function with composeTestRule
        composeTestRule.setContent {
            InvestmentCard(
                code = "MXRF11",
                earnings = "Rendimento: R$ 0,09",
                amount = "R$ 11,52",
                date = "DAQUI A 2 DIAS"
            )
        }

        // Check that the elements are displayed
        composeTestRule.onNodeWithText("MXRF11").assertIsDisplayed()
        composeTestRule.onNodeWithText("Rendimento: R$ 0,09").assertIsDisplayed()
        composeTestRule.onNodeWithText("R$ 11,52").assertIsDisplayed()
        composeTestRule.onNodeWithText("DAQUI A 2 DIAS").assertIsDisplayed()
    }
}
