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
            .size(88.dp)
            .clip(RoundedCornerShape(28.dp))
            .background(Color(0xFF43D6C5)),
          contentAlignment = Alignment.Center
        ) {
          Text("D", color = Color(0xFF102A43), fontSize = 58.sp, fontWeight = FontWeight.ExtraBold)
        }
        Spacer(Modifier.height(14.dp))
        Text("Dovera", color = MaterialTheme.colors.onBackground, fontSize = 26.sp, fontWeight = FontWeight.Bold)
        Text("PRIVATE MESSAGING", color = MaterialTheme.colors.secondary, fontSize = 10.sp, letterSpacing = 2.sp)
      }
    }
  }
}
