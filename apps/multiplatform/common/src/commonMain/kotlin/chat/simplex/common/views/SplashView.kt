package chat.simplex.common.views

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val DoveraBlue = Color(0xFF197ED3)
private val DoveraInk = Color(0xFF102A43)
private val DoveraSilver = Color(0xFFEAF7FF)

@Composable
private fun DoveraBirdMark(modifier: Modifier = Modifier) {
  Canvas(modifier) {
    val bird = Path().apply {
      moveTo(17f, 69f)
      cubicTo(27f, 52f, 38f, 34f, 54f, 25f)
      cubicTo(47f, 39f, 43f, 48f, 40f, 56f)
      cubicTo(52f, 43f, 65f, 33f, 84f, 30f)
      cubicTo(72f, 42f, 68f, 52f, 65f, 62f)
      cubicTo(77f, 54f, 87f, 50f, 96f, 49f)
      cubicTo(83f, 62f, 71f, 72f, 55f, 78f)
      cubicTo(42f, 83f, 28f, 81f, 17f, 69f)
      close()
    }
    val innerWing = Path().apply {
      moveTo(20f, 71f)
      cubicTo(34f, 66f, 46f, 59f, 58f, 48f)
      cubicTo(52f, 61f, 42f, 71f, 29f, 77f)
      cubicTo(25f, 76f, 22f, 74f, 20f, 71f)
      close()
    }
    val feather = Path().apply {
      moveTo(52f, 26f)
      cubicTo(58f, 31f, 65f, 34f, 75f, 34f)
      cubicTo(68f, 38f, 62f, 41f, 55f, 47f)
      cubicTo(57f, 39f, 55f, 32f, 52f, 26f)
      close()
    }
    val tail = Path().apply {
      moveTo(77f, 73f)
      cubicTo(82f, 68f, 87f, 65f, 94f, 63f)
      cubicTo(89f, 72f, 82f, 78f, 73f, 82f)
      lineTo(66f, 82f)
      close()
    }
    val base = Path().apply {
      moveTo(23f, 84f)
      cubicTo(39f, 79f, 55f, 78f, 70f, 81f)
      cubicTo(55f, 86f, 39f, 89f, 23f, 84f)
      close()
    }
    drawContext.transform.scale(size.width / 108f, size.height / 108f, pivot = androidx.compose.ui.geometry.Offset.Zero)
    drawPath(bird, DoveraSilver)
    drawPath(innerWing, Color(0xFFB9DDF4))
    drawPath(feather, Color.White)
    drawPath(tail, Color(0xFFD8F0FF))
    drawPath(base, DoveraSilver)
  }
}

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
            .size(112.dp)
            .clip(RoundedCornerShape(32.dp))
            .background(DoveraBlue),
          contentAlignment = Alignment.Center
        ) {
          DoveraBirdMark(Modifier.size(96.dp))
        }
        Spacer(Modifier.height(18.dp))
        Text(
          "DOVERA",
          color = DoveraBlue,
          fontSize = 28.sp,
          fontWeight = androidx.compose.ui.text.font.FontWeight.ExtraBold,
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
          fontWeight = androidx.compose.ui.text.font.FontWeight.Medium,
          letterSpacing = 1.6.sp
        )
      }
    }
  }
}
