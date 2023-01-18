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

public val RemixIcons.LightbulbFill: ImageVector
    get() {
        if (_lightbulbFill != null) {
            return _lightbulbFill!!
        }
        _lightbulbFill = Builder(name = "LightbulbFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 18.0f)
                lineTo(7.941f, 18.0f)
                curveToRelative(-0.297f, -1.273f, -1.637f, -2.314f, -2.187f, -3.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.49f, 0.002f)
                curveToRelative(-0.55f, 0.685f, -1.888f, 1.726f, -2.185f, 2.998f)
                lineTo(13.0f, 18.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.0f, 20.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _lightbulbFill!!
    }

private var _lightbulbFill: ImageVector? = null