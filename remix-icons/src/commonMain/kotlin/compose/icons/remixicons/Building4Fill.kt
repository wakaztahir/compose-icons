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

public val RemixIcons.Building4Fill: ImageVector
    get() {
        if (_building4Fill != null) {
            return _building4Fill!!
        }
        _building4Fill = Builder(name = "Building4Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(17.0f)
                close()
                moveTo(8.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 11.0f)
                close()
                moveTo(8.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 7.0f)
                lineTo(8.0f, 7.0f)
                close()
                moveTo(8.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 15.0f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _building4Fill!!
    }

private var _building4Fill: ImageVector? = null