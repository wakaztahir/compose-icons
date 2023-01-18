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

public val RemixIcons.ChargingPile2Line: ImageVector
    get() {
        if (_chargingPile2Line != null) {
            return _chargingPile2Line!!
        }
        _chargingPile2Line = Builder(name = "ChargingPile2Line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(12.0f, 19.0f)
                lineTo(12.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(9.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-4.0f, 6.0f)
                verticalLineToRelative(-4.0f)
                lineTo(5.0f, 13.0f)
                lineToRelative(4.0f, -6.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _chargingPile2Line!!
    }

private var _chargingPile2Line: ImageVector? = null