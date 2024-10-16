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
        // Set up
        composeTestRule.setContent {
            InvestmentCard(
                code = "MXRF11",
                earnings = "Rendimento: R$ 0,09",
                amount = "R$ 11,52",
                date = "DAQUI A 2 DIAS"
            )
        }

        // Assert
        composeTestRule.onNodeWithText("MXRF11").assertIsDisplayed()
    }
}
