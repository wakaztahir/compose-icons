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

public val TwotoneGroup.AssistantPhoto: ImageVector
    get() {
        if (_assistantPhoto != null) {
            return _assistantPhoto!!
        }
        _assistantPhoto = Builder(name = "AssistantPhoto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.24f, 12.0f)
                lineToRelative(0.4f, 2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-5.24f)
                lineToRelative(-0.4f, -2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                horizontalLineToRelative(5.6f)
                lineToRelative(0.4f, 2.0f)
                horizontalLineToRelative(7.0f)
                lineTo(20.0f, 6.0f)
                horizontalLineToRelative(-5.6f)
                lineTo(14.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(5.36f)
                lineToRelative(0.4f, 2.0f)
                lineTo(18.0f, 8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.36f)
                lineToRelative(-0.4f, -2.0f)
                lineTo(7.0f, 12.0f)
                lineTo(7.0f, 6.0f)
                close()
            }
        }
        .build()
        return _assistantPhoto!!
    }

private var _assistantPhoto: ImageVector? = null