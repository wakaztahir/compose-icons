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

public val SharpGroup.Filter8: ImageVector
    get() {
        if (_filter8 != null) {
            return _filter8!!
        }
        _filter8 = Builder(name = "Filter8", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                lineTo(1.0f, 5.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 5.0f)
                close()
                moveTo(23.0f, 1.0f)
                lineTo(5.0f, 1.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                lineTo(23.0f, 1.0f)
                close()
                moveTo(21.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(13.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(17.0f, 7.0f)
                curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(11.0f, 13.0f)
                curveToRelative(0.0f, 1.11f, 0.9f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.0f, 7.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _filter8!!
    }

private var _filter8: ImageVector? = null
