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

public val SharpGroup.ShoppingCartCheckout: ImageVector
    get() {
        if (_shoppingCartCheckout != null) {
            return _shoppingCartCheckout!!
        }
        _shoppingCartCheckout = Builder(name = "ShoppingCartCheckout", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(8.1f, 18.0f, 7.0f, 18.0f)
                close()
                moveTo(17.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(18.1f, 18.0f, 17.0f, 18.0f)
                close()
                moveTo(8.1f, 13.0f)
                horizontalLineToRelative(8.66f)
                lineTo(21.0f, 4.96f)
                lineTo(19.25f, 4.0f)
                lineToRelative(-3.7f, 7.0f)
                horizontalLineTo(8.53f)
                lineTo(4.27f, 2.0f)
                horizontalLineTo(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(3.6f, 7.59f)
                lineTo(3.61f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(7.0f)
                lineTo(8.1f, 13.0f)
                close()
                moveTo(12.0f, 2.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(12.17f, 7.0f)
                lineTo(8.0f, 7.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(4.17f, 0.0f)
                lineToRelative(-1.59f, -1.59f)
                lineTo(12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _shoppingCartCheckout!!
    }

private var _shoppingCartCheckout: ImageVector? = null
