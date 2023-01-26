package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.WrapText: ImageVector
    get() {
        if (_wrapText != null) {
            return _wrapText!!
        }
        _wrapText = Builder(name = "WrapText", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(5.0f, 5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(16.83f, 11.0f)
                lineTo(5.0f, 11.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(12.13f)
                curveToRelative(1.0f, 0.0f, 1.93f, 0.67f, 2.09f, 1.66f)
                curveToRelative(0.21f, 1.25f, -0.76f, 2.34f, -1.97f, 2.34f)
                lineTo(15.0f, 17.0f)
                verticalLineToRelative(-0.79f)
                curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineToRelative(-1.79f, 1.79f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f)
                lineToRelative(1.79f, 1.79f)
                curveToRelative(0.32f, 0.32f, 0.85f, 0.09f, 0.85f, -0.35f)
                lineTo(15.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(2.34f, 0.0f, 4.21f, -2.01f, 3.98f, -4.39f)
                curveToRelative(-0.2f, -2.08f, -2.06f, -3.61f, -4.15f, -3.61f)
                close()
                moveTo(9.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _wrapText!!
    }

private var _wrapText: ImageVector? = null
