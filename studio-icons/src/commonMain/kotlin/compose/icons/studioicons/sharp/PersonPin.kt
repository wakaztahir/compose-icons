package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PersonPin: ImageVector
    get() {
        if (_personPin != null) {
            return _personPin!!
        }
        _personPin = Builder(name = "PersonPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                lineTo(21.0f, 2.0f)
                close()
                moveTo(12.0f, 5.3f)
                curveToRelative(1.49f, 0.0f, 2.7f, 1.21f, 2.7f, 2.7f)
                reflectiveCurveToRelative(-1.21f, 2.7f, -2.7f, 2.7f)
                reflectiveCurveTo(9.3f, 9.49f, 9.3f, 8.0f)
                reflectiveCurveToRelative(1.21f, -2.7f, 2.7f, -2.7f)
                close()
                moveTo(18.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-0.9f)
                curveToRelative(0.0f, -2.0f, 4.0f, -3.1f, 6.0f, -3.1f)
                reflectiveCurveToRelative(6.0f, 1.1f, 6.0f, 3.1f)
                verticalLineToRelative(0.9f)
                close()
            }
        }
        .build()
        return _personPin!!
    }

private var _personPin: ImageVector? = null
