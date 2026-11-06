package chat.simplex.common.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val DoveraBlue = Color(0xFF168BE0)
private val DoveraInk = Color(0xFF102A43)

@Composable
fun SplashView(nonTransparent: Boolean = false) {
  Surface(
    Modifier.fillMaxSize(),
    color = if (nonTransparent) MaterialTheme.colors.background.copy(1f) else MaterialTheme.colors.background,
    contentColor = LocalContentColor.current
  ) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
      Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
          Modifier
            .size(104.dp)
            .clip(RoundedCornerShape(32.dp))
            .background(DoveraBlue),
          contentAlignment = Alignment.Center
        ) {
          Text(
            "D",
            color = Color.White,
            fontSize = 64.sp,
            fontWeight = FontWeight.ExtraBold,
            letterSpacing = (-2).sp
          )
        }
        Spacer(Modifier.height(18.dp))
        Text(
          "DOVERA",
          color = DoveraBlue,
          fontSize = 28.sp,
          fontWeight = FontWeight.ExtraBold,
          letterSpacing = 3.sp
        )
        Spacer(Modifier.height(5.dp))
        Text(
          "PRIVATE MESSAGING",
          color = MaterialTheme.colors.secondary,
          fontSize = 10.sp,
          letterSpacing = 2.sp
        )
        Spacer(Modifier.height(8.dp))
        Text(
          "SIGNED KALIMAT",
          color = DoveraInk.copy(alpha = 0.62f),
          fontSize = 9.sp,
          fontWeight = FontWeight.Medium,
          letterSpacing = 1.6.sp
        )
      }
    }
  }
}
