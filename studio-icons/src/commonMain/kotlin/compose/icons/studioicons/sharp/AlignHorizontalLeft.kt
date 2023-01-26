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

public val SharpGroup.AlignHorizontalLeft: ImageVector
    get() {
        if (_alignHorizontalLeft != null) {
            return _alignHorizontalLeft!!
        }
        _alignHorizontalLeft = Builder(name = "AlignHorizontalLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(22.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _alignHorizontalLeft!!
    }

private var _alignHorizontalLeft: ImageVector? = null
