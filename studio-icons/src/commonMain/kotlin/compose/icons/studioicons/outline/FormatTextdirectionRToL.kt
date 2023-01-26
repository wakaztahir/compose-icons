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

public val OutlineGroup.FormatTextdirectionRToL: ImageVector
    get() {
        if (_formatTextdirectionRToL != null) {
            return _formatTextdirectionRToL!!
        }
        _formatTextdirectionRToL = Builder(name = "FormatTextdirectionRToL", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                moveToRelative(8.0f, -2.0f)
                horizontalLineToRelative(-8.0f)
                curveTo(7.79f, 2.0f, 6.0f, 3.79f, 6.0f, 6.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(8.0f, 14.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(4.0f, 4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _formatTextdirectionRToL!!
    }

private var _formatTextdirectionRToL: ImageVector? = null
