package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Villa: ImageVector
    get() {
        if (_villa != null) {
            return _villa!!
        }
        _villa = Builder(name = "Villa", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                lineToRelative(13.0f, -5.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                close()
                moveTo(19.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-9.0f)
                curveTo(21.0f, 10.9f, 20.1f, 10.0f, 19.0f, 10.0f)
                close()
            }
        }
        .build()
        return _villa!!
    }

private var _villa: ImageVector? = null
