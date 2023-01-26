package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Colorize: ImageVector
    get() {
        if (_colorize != null) {
            return _colorize!!
        }
        _colorize = Builder(name = "Colorize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.66f, 5.41f)
                lineToRelative(0.92f, 0.92f)
                lineToRelative(-2.69f, 2.69f)
                lineToRelative(-0.92f, -0.92f)
                lineToRelative(2.69f, -2.69f)
                moveTo(17.67f, 3.0f)
                curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f)
                lineToRelative(-3.12f, 3.12f)
                lineToRelative(-1.93f, -1.91f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.42f, 1.42f)
                lineTo(3.0f, 16.25f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(4.75f)
                lineToRelative(8.92f, -8.92f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.92f, -1.92f)
                lineToRelative(3.12f, -3.12f)
                curveToRelative(0.4f, -0.4f, 0.4f, -1.03f, 0.01f, -1.42f)
                lineToRelative(-2.34f, -2.34f)
                curveToRelative(-0.2f, -0.19f, -0.45f, -0.29f, -0.7f, -0.29f)
                close()
                moveTo(6.92f, 19.0f)
                lineTo(5.0f, 17.08f)
                lineToRelative(8.06f, -8.06f)
                lineToRelative(1.92f, 1.92f)
                lineTo(6.92f, 19.0f)
                close()
            }
        }
        .build()
        return _colorize!!
    }

private var _colorize: ImageVector? = null
