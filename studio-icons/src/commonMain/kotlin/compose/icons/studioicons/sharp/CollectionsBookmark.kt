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

public val SharpGroup.CollectionsBookmark: ImageVector
    get() {
        if (_collectionsBookmark != null) {
            return _collectionsBookmark!!
        }
        _collectionsBookmark = Builder(name = "CollectionsBookmark", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 6.0f)
                close()
                moveTo(22.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(22.0f, 2.0f)
                close()
                moveTo(20.0f, 12.0f)
                lineToRelative(-2.5f, -1.5f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _collectionsBookmark!!
    }

private var _collectionsBookmark: ImageVector? = null