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

public val RemixIcons.ArrowLeftRightFill: ImageVector
    get() {
        if (_arrowLeftRightFill != null) {
            return _arrowLeftRightFill!!
        }
        _arrowLeftRightFill = Builder(name = "ArrowLeftRightFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(-5.0f, 5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(8.0f, 2.0f)
                verticalLineToRelative(3.999f)
                lineTo(20.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 7.0f)
                lineToRelative(5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _arrowLeftRightFill!!
    }

private var _arrowLeftRightFill: ImageVector? = null