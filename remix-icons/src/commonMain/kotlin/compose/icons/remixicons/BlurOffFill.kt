package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BlurOffFill: ImageVector
    get() {
        if (_blurOffFill != null) {
            return _blurOffFill!!
        }
        _blurOffFill = Builder(name = "BlurOffFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.432f, 6.846f)
                lineTo(1.393f, 2.808f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(19.799f, 19.8f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(-3.038f, -3.04f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 5.432f, 6.848f)
                close()
                moveTo(8.243f, 4.03f)
                lineTo(12.0f, 0.272f)
                lineToRelative(6.364f, 6.364f)
                arcToRelative(9.002f, 9.002f, 0.0f, false, true, 2.05f, 9.564f)
                lineTo(8.244f, 4.03f)
                close()
            }
        }
        .build()
        return _blurOffFill!!
    }

private var _blurOffFill: ImageVector? = null