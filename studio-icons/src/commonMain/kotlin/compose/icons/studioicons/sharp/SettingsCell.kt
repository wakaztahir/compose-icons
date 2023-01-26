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

public val SharpGroup.SettingsCell: ImageVector
    get() {
        if (_settingsCell != null) {
            return _settingsCell!!
        }
        _settingsCell = Builder(name = "SettingsCell", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 24.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                close()
                moveTo(16.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _settingsCell!!
    }

private var _settingsCell: ImageVector? = null
