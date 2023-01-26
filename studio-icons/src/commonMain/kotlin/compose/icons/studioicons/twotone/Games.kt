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

public val TwotoneGroup.Games: ImageVector
    get() {
        if (_games != null) {
            return _games!!
        }
        _games = Builder(name = "Games", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 17.33f)
                lineTo(11.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.67f)
                lineToRelative(-1.0f, -1.0f)
                close()
                moveTo(13.0f, 6.67f)
                lineTo(13.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.67f)
                lineToRelative(1.0f, 1.0f)
                close()
                moveTo(16.33f, 12.0f)
                lineToRelative(1.0f, 1.0f)
                lineTo(20.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.67f)
                close()
                moveTo(4.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.67f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(-1.0f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.5f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(-3.0f, -3.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(6.67f, 13.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.67f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(-1.0f, 1.0f)
                close()
                moveTo(22.0f, 9.0f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(3.0f, 3.0f)
                lineTo(22.0f, 15.0f)
                lineTo(22.0f, 9.0f)
                close()
                moveTo(20.0f, 13.0f)
                horizontalLineToRelative(-2.67f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(1.0f, -1.0f)
                lineTo(20.0f, 11.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 16.5f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(-3.0f, 3.0f)
                lineTo(9.0f, 22.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(13.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.67f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(1.0f, 1.0f)
                lineTo(13.0f, 20.0f)
                close()
                moveTo(9.0f, 7.5f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                lineTo(15.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.67f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(-1.0f, -1.0f)
                lineTo(11.0f, 4.0f)
                close()
            }
        }
        .build()
        return _games!!
    }

private var _games: ImageVector? = null
