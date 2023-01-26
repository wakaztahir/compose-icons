package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.AddPhotoAlternate: ImageVector
    get() {
        if (_addPhotoAlternate != null) {
            return _addPhotoAlternate!!
        }
        _addPhotoAlternate = Builder(name = "AddPhotoAlternate", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineToRelative(9.0f)
                lineTo(13.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(10.21f, 16.83f)
                lineToRelative(-1.96f, -2.36f)
                lineTo(5.5f, 18.0f)
                horizontalLineToRelative(11.0f)
                lineToRelative(-3.54f, -4.71f)
                close()
                moveTo(20.0f, 4.0f)
                lineTo(20.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.01f, 0.01f, 0.0f, 2.0f, 0.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.99f)
                curveToRelative(0.01f, 0.01f, 2.0f, 0.0f, 2.0f, 0.0f)
                lineTo(20.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                lineTo(23.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _addPhotoAlternate!!
    }

private var _addPhotoAlternate: ImageVector? = null
