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

public val RoundGroup.CurrencyRuble: ImageVector
    get() {
        if (_currencyRuble != null) {
            return _currencyRuble!!
        }
        _currencyRuble = Builder(name = "CurrencyRuble", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 21.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(3.22f, 0.0f, 5.79f, -2.76f, 5.47f, -6.04f)
                curveTo(18.7f, 5.1f, 16.14f, 3.0f, 13.26f, 3.0f)
                lineToRelative(-0.96f, 0.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 3.0f, 7.0f, 3.45f, 7.0f, 4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                curveTo(7.0f, 20.55f, 7.45f, 21.0f, 8.0f, 21.0f)
                close()
                moveTo(13.5f, 12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(4.5f)
                curveTo(15.43f, 5.0f, 17.0f, 6.57f, 17.0f, 8.5f)
                reflectiveCurveTo(15.43f, 12.0f, 13.5f, 12.0f)
                close()
            }
        }
        .build()
        return _currencyRuble!!
    }

private var _currencyRuble: ImageVector? = null
