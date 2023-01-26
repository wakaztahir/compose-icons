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

public val SharpGroup.AddComment: ImageVector
    get() {
        if (_addComment != null) {
            return _addComment!!
        }
        _addComment = Builder(name = "AddComment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                lineToRelative(4.0f, 4.0f)
                lineTo(22.0f, 2.0f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.0f)
                lineTo(7.0f, 11.0f)
                lineTo(7.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _addComment!!
    }

private var _addComment: ImageVector? = null
