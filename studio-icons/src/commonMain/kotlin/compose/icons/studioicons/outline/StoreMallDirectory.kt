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

public val OutlineGroup.StoreMallDirectory: ImageVector
    get() {
        if (_storeMallDirectory != null) {
            return _storeMallDirectory!!
        }
        _storeMallDirectory = Builder(name = "StoreMallDirectory", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.36f, 9.0f)
                lineToRelative(0.6f, 3.0f)
                lineTo(5.04f, 12.0f)
                lineToRelative(0.6f, -3.0f)
                horizontalLineToRelative(12.72f)
                moveTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 4.0f)
                close()
                moveTo(20.0f, 7.0f)
                lineTo(4.0f, 7.0f)
                lineToRelative(-1.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-1.0f, -5.0f)
                close()
                moveTo(6.0f, 18.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 18.0f)
                close()
            }
        }
        .build()
        return _storeMallDirectory!!
    }

private var _storeMallDirectory: ImageVector? = null
