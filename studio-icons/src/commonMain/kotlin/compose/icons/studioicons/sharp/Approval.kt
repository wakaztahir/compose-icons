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

public val SharpGroup.Approval: ImageVector
    get() {
        if (_approval != null) {
            return _approval!!
        }
        _approval = Builder(name = "Approval", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 14.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(18.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(9.24f, 2.0f, 7.0f, 4.24f, 7.0f, 7.0f)
                lineToRelative(5.0f, 7.0f)
                lineToRelative(5.0f, -7.0f)
                curveTo(17.0f, 4.24f, 14.76f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _approval!!
    }

private var _approval: ImageVector? = null