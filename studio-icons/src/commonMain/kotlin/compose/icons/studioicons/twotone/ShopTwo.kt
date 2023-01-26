package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ShopTwo: ImageVector
    get() {
        if (_shopTwo != null) {
            return _shopTwo!!
        }
        _shopTwo = Builder(name = "ShopTwo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 7.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(14.0f)
                lineTo(21.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(12.0f, 15.0f)
                lineTo(12.0f, 8.0f)
                lineToRelative(5.5f, 3.0f)
                lineToRelative(-5.5f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 9.0f)
                lineTo(1.0f, 9.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                lineTo(3.0f, 20.0f)
                lineTo(3.0f, 9.0f)
                close()
                moveTo(18.0f, 5.0f)
                lineTo(18.0f, 3.0f)
                curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                lineTo(23.0f, 5.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(12.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(7.0f, 16.0f)
                lineTo(7.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(12.0f, 15.0f)
                lineToRelative(5.5f, -4.0f)
                lineTo(12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _shopTwo!!
    }

private var _shopTwo: ImageVector? = null
