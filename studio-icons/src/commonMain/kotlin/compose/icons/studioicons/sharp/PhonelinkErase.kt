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

public val SharpGroup.PhonelinkErase: ImageVector
    get() {
        if (_phonelinkErase != null) {
            return _phonelinkErase!!
        }
        _phonelinkErase = Builder(name = "PhonelinkErase", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.2f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(4.0f, -4.0f)
                close()
                moveTo(21.0f, 1.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _phonelinkErase!!
    }

private var _phonelinkErase: ImageVector? = null
