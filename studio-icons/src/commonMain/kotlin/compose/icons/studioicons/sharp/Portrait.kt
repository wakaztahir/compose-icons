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

public val SharpGroup.Portrait: ImageVector
    get() {
        if (_portrait != null) {
            return _portrait!!
        }
        _portrait = Builder(name = "Portrait", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.25f)
                curveToRelative(1.24f, 0.0f, 2.25f, -1.01f, 2.25f, -2.25f)
                reflectiveCurveTo(13.24f, 7.75f, 12.0f, 7.75f)
                reflectiveCurveTo(9.75f, 8.76f, 9.75f, 10.0f)
                reflectiveCurveToRelative(1.01f, 2.25f, 2.25f, 2.25f)
                close()
                moveTo(16.5f, 16.25f)
                curveToRelative(0.0f, -1.5f, -3.0f, -2.25f, -4.5f, -2.25f)
                reflectiveCurveToRelative(-4.5f, 0.75f, -4.5f, 2.25f)
                lineTo(7.5f, 17.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(21.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 3.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(14.0f)
                close()
            }
        }
        .build()
        return _portrait!!
    }

private var _portrait: ImageVector? = null
