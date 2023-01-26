package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SpeakerNotesOff: ImageVector
    get() {
        if (_speakerNotesOff != null) {
            return _speakerNotesOff!!
        }
        _speakerNotesOff = Builder(name = "SpeakerNotesOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.54f, 11.0f)
                lineToRelative(-0.54f, -0.54f)
                lineTo(7.54f, 8.0f)
                lineTo(6.0f, 6.46f)
                lineTo(2.38f, 2.84f)
                lineTo(1.27f, 1.73f)
                lineTo(0.0f, 3.0f)
                lineToRelative(2.01f, 2.01f)
                lineTo(2.0f, 22.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(9.0f)
                lineToRelative(5.73f, 5.73f)
                lineTo(22.0f, 22.46f)
                lineTo(17.54f, 18.0f)
                lineToRelative(-7.0f, -7.0f)
                close()
                moveTo(8.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(6.0f, 9.0f)
                lineToRelative(2.0f, 2.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(20.0f, 2.0f)
                lineTo(4.08f, 2.0f)
                lineTo(10.0f, 7.92f)
                lineTo(10.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-7.92f)
                lineToRelative(1.0f, 1.0f)
                lineTo(18.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.92f)
                lineToRelative(6.99f, 6.99f)
                curveTo(21.14f, 17.95f, 22.0f, 17.08f, 22.0f, 16.0f)
                lineTo(22.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _speakerNotesOff!!
    }

private var _speakerNotesOff: ImageVector? = null
