package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ArrowBackIosNew: ImageVector
    get() {
        if (_arrowBackIosNew != null) {
            return _arrowBackIosNew!!
        }
        _arrowBackIosNew = Builder(name = "ArrowBackIosNew", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.77f, 3.77f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(-10.0f, 10.0f)
                lineToRelative(10.0f, 10.0f)
                lineToRelative(1.77f, -1.77f)
                lineToRelative(-8.23f, -8.23f)
                close()
            }
        }
        .build()
        return _arrowBackIosNew!!
    }

private var _arrowBackIosNew: ImageVector? = null