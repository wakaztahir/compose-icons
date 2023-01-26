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

public val TwotoneGroup.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = Builder(name = "Navigation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.72f, 17.7f)
                lineToRelative(3.47f, -1.53f)
                lineToRelative(0.81f, -0.36f)
                lineToRelative(0.81f, 0.36f)
                lineToRelative(3.47f, 1.53f)
                lineTo(12.0f, 7.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 20.29f)
                lineToRelative(0.71f, 0.71f)
                lineTo(12.0f, 18.0f)
                lineToRelative(6.79f, 3.0f)
                lineToRelative(0.71f, -0.71f)
                lineTo(12.0f, 2.0f)
                lineTo(4.5f, 20.29f)
                close()
                moveTo(12.81f, 16.17f)
                lineToRelative(-0.81f, -0.36f)
                lineToRelative(-0.81f, 0.36f)
                lineToRelative(-3.47f, 1.53f)
                lineTo(12.0f, 7.27f)
                lineToRelative(4.28f, 10.43f)
                lineToRelative(-3.47f, -1.53f)
                close()
            }
        }
        .build()
        return _navigation!!
    }

private var _navigation: ImageVector? = null
